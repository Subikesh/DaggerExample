package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerexample.models.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // Injecting the computer field. So dagger will automatically assign created object to computer object
    // For injecting fields, it should be private, so it can be accessed by the DaggerComponentClass
    @Inject lateinit var computer: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: ComputerComponent = DaggerComputerComponent.create()

        // Injecting all the annotated fields of 'this' class using field injection
        component.inject(this)
        computer.startComputer()
    }
}