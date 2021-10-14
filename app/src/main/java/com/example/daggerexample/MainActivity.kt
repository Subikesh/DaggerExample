package com.example.daggerexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerexample.computer.Computer
import com.example.daggerexample.dagger.ComputerComponent
import com.example.daggerexample.dagger.DaggerComputerComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var computer1: Computer
    @Inject lateinit var computer2: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Getting the component from application class
        val component: ComputerComponent = (application as MyApplication).component

        component.inject(this)

        computer1.startComputer()
        computer2.startComputer()
    }
}