package com.jon.pattern.head.decorator

class Mocha : CondimentDecorator {
    val beverage: Beverage

    constructor(beverage: Beverage) : super() {
        this.beverage = beverage
    }

    override fun cost(): Double {
        return 0.20 + beverage.cost()
    }

    override var description: String = ""
        get() {
            return beverage.description + ", Mocha"
        }

}