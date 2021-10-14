package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerexample.computer.Computer
import com.example.daggerexample.dagger.ComputerComponent
import com.example.daggerexample.dagger.DaggerComputerComponent
import com.example.daggerexample.dagger.LaptopDisplayModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // Injecting the computer field. So dagger will automatically assign created object to computer object
    // For injecting fields, it should be private, so it can be accessed by the DaggerComponentClass
    @Inject lateinit var computer: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Instead of sending the display module, we can send just the resolution string
        val component: ComputerComponent = DaggerComputerComponent.builder()
            .resolution("UHD")
            .build()

        // Injecting all the annotated fields of 'this' class using field injection
        component.inject(this)

        computer.startComputer()
    }
}