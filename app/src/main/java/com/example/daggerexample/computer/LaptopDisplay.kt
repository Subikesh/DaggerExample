package com.example.daggerexample.computer

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

// resolution is taken from module provides
class LaptopDisplay @Inject constructor(@Named("resolution") override val resolution: String) :
    Display {
    override fun start() {
        Log.i("Computer", "Laptop display started with resolution: $resolution")
    }
}