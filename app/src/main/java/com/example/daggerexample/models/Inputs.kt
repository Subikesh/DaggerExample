package com.example.daggerexample.models

import javax.inject.Inject

class Inputs @Inject constructor(
    val keyboard: Keyboard,
    val mouse: Mouse
)