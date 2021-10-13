package com.example.daggerexample.dagger

import com.example.daggerexample.MainActivity
import com.example.daggerexample.computer.Computer
import dagger.Component

// Creating component
@Component(modules = [InputsModule::class, LaptopDisplayModule::class])
interface ComputerComponent {
    fun getComputer(): Computer

    /**
     * Dagger finds all the fields to be injected in the MainActivity class and assigns
     * corresponding values to them. **name of the method need not be "inject"**
     * @param activity the class which is to be searched and field injected
     */
    fun inject(activity: MainActivity)
}