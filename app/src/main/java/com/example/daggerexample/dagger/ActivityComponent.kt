package com.example.daggerexample.dagger

import com.example.daggerexample.MainActivity
import com.example.daggerexample.computer.Computer
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

// Here ComputerComponent is refactored to ActivityComponent and Computer is given activity scope
@ActivityScope
// Adding component dependencies. ActivityComponent depends on Power Supply from AppComponent
@Component(dependencies = [AppComponent::class], modules = [InputsModule::class, MonitorDisplayModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)

    // Overriding the component builder, so we can send data in runtime
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun resolution(@Named("resolution") resolution: String): Builder

        // A setter for app component in component builder
        // This will be created automatically. Since Component builder is overridden, we have to
        // provide setter for this
        fun appComponent(appComponent: AppComponent): Builder

        fun build(): ActivityComponent
    }
}