package com.example.daggerexample.dagger

import com.example.daggerexample.computer.PowerSupply
import dagger.Component
import javax.inject.Singleton

// Singleton scope is assigned for PowerSupply object which will be same even after activity dies
@Singleton
@Component
interface AppComponent {
    // Returns the activity component if there is no custom component builder
//    fun getActivityComponent(laptopDisplayModule: LaptopDisplayModule): ActivityComponent

    // Returns the subcomponent builder so the component can by built from calling class
    fun getActivityComponentBuilder(): ActivityComponent.Builder
}

// Generally AppComponent returns the retrofit instance from the AppModule