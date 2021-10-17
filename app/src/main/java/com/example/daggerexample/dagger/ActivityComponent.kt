package com.example.daggerexample.dagger

import com.example.daggerexample.MainActivity
import com.example.daggerexample.computer.Computer
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named
import javax.inject.Singleton

// This inherits the dependency graph of parent component
@ActivityScope
@Subcomponent(modules = [InputsModule::class, MonitorDisplayModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)

    // Factory class created which has a function which accepts resolution string
    // and returns Component instance
    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @Named("resolution") resolution: String
        ) : ActivityComponent
    }
}