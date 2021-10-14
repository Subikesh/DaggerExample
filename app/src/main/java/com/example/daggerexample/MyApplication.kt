package com.example.daggerexample

import android.app.Application
import com.example.daggerexample.dagger.ComputerComponent
import com.example.daggerexample.dagger.DaggerComputerComponent

// This is the application class which stores App Component
class MyApplication : Application() {
    lateinit var component: ComputerComponent
        private set

    override fun onCreate() {
        super.onCreate()

        component = DaggerComputerComponent.builder()
            .resolution("UHD")
            .build()
    }
}