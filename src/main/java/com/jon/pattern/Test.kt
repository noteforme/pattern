package com.jon.pattern

import com.jon.pattern.juejin.decorator.Beverage
import com.jon.pattern.juejin.decorator.DarkRoast
import com.jon.pattern.juejin.decorator.Espresso
import com.jon.pattern.juejin.decorator.Mocha

fun main(args: Array<String>) {

    var beverage: Beverage = Espresso()
    println(
        beverage.description + " $" + beverage.cost()
    )
    var beverage2: Beverage = DarkRoast()
    beverage2 = Mocha(beverage2)

    println(beverage2.description + " $" + beverage2.cost())
}