package com.example.daggerexample.models

import android.util.Log
import javax.inject.Inject

class LaptopDisplay @Inject constructor() : Display {
    override fun start() {
        Log.i("Computer", "TV display started")
    }
}