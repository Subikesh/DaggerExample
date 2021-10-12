package com.example.daggerexample.models

import javax.inject.Inject

class Inputs @Inject constructor(
    private val keyboard: Keyboard,
    private val mouse: Mouse
)