package com.example.daggerexample.models

import android.util.Log
import javax.inject.Inject

class MonitorDisplay @Inject constructor() : Display{
    override fun start() {
        Log.i("Computer", "Monitor display started")
    }
}