package com.example.daggerexample.models

import android.util.Log

class Computer(
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