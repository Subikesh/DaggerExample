package com.example.daggerexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerexample.computer.Computer
import com.example.daggerexample.dagger.ActivityComponent
import com.example.daggerexample.dagger.LaptopDisplayModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var computer1: Computer

    @Inject
    lateinit var computer2: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Getting the subcomponent from component class
//        val component: ActivityComponent =
//            (application as MyApplication).component.getActivityComponent(LaptopDisplayModule("FHD+"))

        // Getting the subcomponent builder and passing resolution ourself
        val component: ActivityComponent =
            (application as MyApplication).component.getActivityComponentBuilder()
                .resolution("FHD+")
                .build()

        component.inject(this)

        computer1.startComputer()
        computer2.startComputer()
    }
}