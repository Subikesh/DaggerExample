package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerexample.models.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hard dependencies created
        val processor = Processor()
        val display = Display()
        val inputs = Inputs(Keyboard(), Mouse())

        val computer = Computer(processor, display, inputs)
        computer.startComputer()
    }
}