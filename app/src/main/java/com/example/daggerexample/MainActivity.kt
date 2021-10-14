package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerexample.computer.Computer
import com.example.daggerexample.dagger.ComputerComponent
import com.example.daggerexample.dagger.DaggerComputerComponent
import com.example.daggerexample.dagger.LaptopDisplayModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var computer1: Computer
    @Inject lateinit var computer2: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: ComputerComponent = DaggerComputerComponent.builder()
            .resolution("UHD")
            .build()

        component.inject(this)

        computer1.startComputer()
        computer2.startComputer()
    }
}