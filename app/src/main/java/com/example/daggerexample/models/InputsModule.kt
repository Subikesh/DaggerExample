package com.example.daggerexample.models

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class InputsModule {

    // Defining provide methods for Keyboard, Mouse, Inputs
    @Provides
    fun providesKeyboard() = Keyboard()

    // Provider functions parameters are taken from the module's provider methods and inject constructors
    @Provides
    fun providesInputs(keyboard: Keyboard, mouse: Mouse): Inputs {
        Log.i("Computer", "Inputs created")
        return Inputs(keyboard, mouse)
    }
}