package com.example.daggerexample.dagger

import com.example.daggerexample.computer.Display
import com.example.daggerexample.computer.LaptopDisplay
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class LaptopDisplayModule(
    @Named("resolution") private val resolution: String
) {

    // Named will let dagger differentiate which String is required from all fields of type String
    // Generally done on primitive types
    @Provides
    @Named("resolution")
    fun provideResolution(): String = resolution

    // Getting inputs in runtime and providing LaptopDisplay class
    @Provides
    fun provideDisplay(display: LaptopDisplay): Display = display
}