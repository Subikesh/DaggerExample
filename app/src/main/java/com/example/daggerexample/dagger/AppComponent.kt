package com.example.daggerexample.dagger

import com.example.daggerexample.computer.PowerSupply
import dagger.Component
import javax.inject.Singleton

// Singleton scope is assigned for PowerSupply object which will be same even after activity dies
@Singleton
@Component
interface AppComponent {
    fun getActivityComponentFactory(): ActivityComponent.Factory
}
