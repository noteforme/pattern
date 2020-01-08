package com.jon.pattern

import com.jon.pattern.decorator.Beverage
import com.jon.pattern.decorator.DarkRoast
import com.jon.pattern.decorator.Espresso
import com.jon.pattern.decorator.Mocha

fun main(args: Array<String>) {

    var beverage: Beverage = Espresso()
    println(
        beverage.description + " $" + beverage.cost()
    )
    var beverage2: Beverage = DarkRoast()
    beverage2 = Mocha(beverage2)

    println(beverage2.description + " $" + beverage2.cost())
}