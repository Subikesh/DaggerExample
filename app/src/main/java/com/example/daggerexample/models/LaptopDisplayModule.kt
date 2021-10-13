package com.example.daggerexample.models

import dagger.Binds
import dagger.Module

@Module
abstract class LaptopDisplayModule {

//    @Provides
//    fun provideDisplay(): Display = LaptopDisplay()

    // We can use Binds to directly return the Display using LaptopDisplay object
    // Here binds has dependency on LaptopDisplay which is found by constructor injection
    @Binds
    abstract fun bindDisplay(display: LaptopDisplay): Display
}