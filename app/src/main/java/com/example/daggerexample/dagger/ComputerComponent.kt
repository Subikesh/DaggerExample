package com.example.daggerexample.dagger

import com.example.daggerexample.MainActivity
import com.example.daggerexample.computer.Computer
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

// Creating component
@Component(modules = [InputsModule::class, MonitorDisplayModule::class])
interface ComputerComponent {
    fun getComputer(): Computer

    fun inject(activity: MainActivity)

    // Overriding the component builder, so we can send data in runtime
    @Component.Builder
    interface Builder {
        // Injecting display resolution. Binds the argument to a field, so it can be send to any dependencies
        // Returns Builder instance to continue the chain function calls
        @BindsInstance
        fun resolution(@Named("resolution") resolution: String): Builder

        // Implement build method which returns our created component
        fun build(): ComputerComponent
    }
}