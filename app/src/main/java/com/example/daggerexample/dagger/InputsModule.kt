package com.example.daggerexample.dagger

import android.util.Log
import com.example.daggerexample.computer.Inputs
import com.example.daggerexample.computer.Keyboard
import com.example.daggerexample.computer.Mouse
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