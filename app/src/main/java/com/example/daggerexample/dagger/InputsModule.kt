package com.example.daggerexample.dagger

import android.util.Log
import com.example.daggerexample.computer.Inputs
import com.example.daggerexample.computer.Keyboard
import com.example.daggerexample.computer.Mouse
import dagger.Module
import dagger.Provides

@Module
class InputsModule {

    @Provides
    fun providesInputs(keyboard: Keyboard, mouse: Mouse): Inputs {
        Log.i("Computer", "Inputs created")
        return Inputs(keyboard, mouse)
    }
}