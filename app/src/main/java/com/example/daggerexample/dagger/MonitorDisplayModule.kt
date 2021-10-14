package com.example.daggerexample.dagger

import com.example.daggerexample.computer.Display
import com.example.daggerexample.computer.MonitorDisplay
import dagger.Binds
import dagger.Module

@Module
interface MonitorDisplayModule {
    @Binds
    fun bindMonitorDisplay(display: MonitorDisplay): Display
}