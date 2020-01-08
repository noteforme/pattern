package com.jon.pattern.decorator

abstract class Beverage {
    open var description: String = "Unknown Beverage"


    abstract fun cost(): Double


}