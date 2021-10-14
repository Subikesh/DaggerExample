package com.example.daggerexample.dagger

import javax.inject.Scope

// Created a new scope which will be referenced for objects inside activity scope
@Scope
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope
