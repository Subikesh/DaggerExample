package com.example.daggerexample.models

import com.example.daggerexample.MainActivity
import dagger.Component

// Creating component
@Component
interface ComputerComponent {
    fun getComputer(): Computer

    /**
     * Dagger finds all the fields to be injected in the MainActivity class and assigns
     * corresponding values to them. **name of the method need not be "inject"**
     * @param activity the class which is to be searched and field injected
     */
    fun inject(activity: MainActivity)
}