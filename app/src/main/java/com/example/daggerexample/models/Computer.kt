package com.example.daggerexample.models

import android.util.Log
import javax.inject.Inject

// Injecting constructor
class Computer @Inject constructor(
        val processor: Processor,
        val display: Display,
        val inputs: Inputs
) {
    companion object {
        private const val TAG = "Computer"
    }
    
    fun startComputer() {
        Log.i(TAG, "Computer started and running.")
    }
}