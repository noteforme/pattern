package com.jon.pattern.juejin.decorator

abstract class Beverage {
    open var description: String = "Unknown Beverage"


    abstract fun cost(): Double


}