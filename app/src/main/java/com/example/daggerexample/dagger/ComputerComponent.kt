package com.example.daggerexample.dagger

import com.example.daggerexample.MainActivity
import com.example.daggerexample.computer.Computer
import dagger.Component

// Creating component
@Component(modules = [InputsModule::class, LaptopDisplayModule::class])
interface ComputerComponent {
    fun getComputer(): Computer

    fun inject(activity: MainActivity)
}