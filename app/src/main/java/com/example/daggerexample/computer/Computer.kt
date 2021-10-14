package com.example.daggerexample.computer

import android.util.Log
import javax.inject.Inject

class Computer @Inject constructor(
    private val powerSupply: PowerSupply,
    private val processor: Processor,
    private val display: Display,
    private val inputs: Inputs
) {
    companion object {
        private const val TAG = "Computer"
    }
    
    fun startComputer() {
        display.start()
        Log.i("ComputerPower", "Computer $this runs on $powerSupply")
        Log.i(TAG, "Computer started and running.")
    }
}