package com.example.daggerexample.computer

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class MonitorDisplay @Inject constructor(@Named("resolution") override val resolution: String) :
    Display {

    override fun start() {
        Log.i("Computer", "Monitor display started with resolution: $resolution")
    }
}