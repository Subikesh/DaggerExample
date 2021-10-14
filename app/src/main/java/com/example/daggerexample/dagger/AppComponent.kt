package com.example.daggerexample.dagger

import com.example.daggerexample.computer.PowerSupply
import dagger.Component
import javax.inject.Singleton

// Singleton scope is assigned for PowerSupply object which will be same even after activity dies
@Singleton
@Component
interface AppComponent {

    // A getter function to get the created PowerSupply
    fun powerSupply(): PowerSupply
}

// Generally AppComponent returns the retrofit instance from the AppModule