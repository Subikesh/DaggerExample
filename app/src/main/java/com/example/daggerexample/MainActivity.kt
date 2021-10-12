package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerexample.models.*

class MainActivity : AppCompatActivity() {
    private lateinit var computer: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // DaggerComputerComponent class is created by dagger implementing ComputerComponent
        val component: ComputerComponent = DaggerComputerComponent.create()

        computer = component.getComputer()
        computer.startComputer()
    }
}