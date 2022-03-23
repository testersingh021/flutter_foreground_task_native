package com.pravera.flutter_foreground_task_native.models

import android.content.SharedPreferences
import com.pravera.flutter_foreground_task_native.service.ForegroundServiceAction
import com.pravera.flutter_foreground_task_native.service.ForegroundServicePrefsKey as PrefsKey

data class ForegroundServiceStatus(val action: String) {
    companion object {
        fun getDataFromPreferences(prefs: SharedPreferences): ForegroundServiceStatus {
            val action = prefs.getString(PrefsKey.SERVICE_ACTION, null)
                ?: ForegroundServiceAction.STOP

            return ForegroundServiceStatus(action = action)
        }
    }
}
