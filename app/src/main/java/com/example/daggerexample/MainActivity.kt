package com.example.daggerexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerexample.computer.Computer
import com.example.daggerexample.dagger.ActivityComponent
import com.example.daggerexample.dagger.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var computer1: Computer
    @Inject lateinit var computer2: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Getting the component from application class and sending it to activity component
        val component: ActivityComponent = DaggerActivityComponent.builder()
            .resolution("UHD")
            .appComponent((application as MyApplication).component)
            .build()

        component.inject(this)

        computer1.startComputer()
        computer2.startComputer()
    }
}