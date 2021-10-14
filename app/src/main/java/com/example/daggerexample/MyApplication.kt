package com.example.daggerexample

import android.app.Application
import com.example.daggerexample.dagger.AppComponent
import com.example.daggerexample.dagger.DaggerAppComponent

class MyApplication : Application() {
    lateinit var component: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()

        // Storing Application component
        component = DaggerAppComponent.create()
    }
}