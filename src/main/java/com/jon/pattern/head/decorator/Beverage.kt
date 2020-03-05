package com.jon.pattern.head.decorator

abstract class Beverage {
    open var description: String = "Unknown Beverage"


    abstract fun cost(): Double


}