package com.example.daggerexample.computer

import android.util.Log
import javax.inject.Inject

// Injecting constructor
class Computer @Inject constructor(
    private val processor: Processor,
    private val display: Display,
    private val inputs: Inputs
) {
    companion object {
        private const val TAG = "Computer"
    }
    
    fun startComputer() {
        // Calling the function from corresponding display class
        display.start()
        Log.i(TAG, "Computer started and running.")
    }
}