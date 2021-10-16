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

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun resolution(@Named("resolution") resolution: String): Builder

        fun build(): ActivityComponent
    }
}