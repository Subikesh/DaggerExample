package com.example.daggerexample.models

import dagger.Component

// Creating component
@Component
interface ComputerComponent {
    fun getComputer(): Computer
}