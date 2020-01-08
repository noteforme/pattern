package com.jon.pattern.decorator

class DarkRoast:Beverage(){

    override fun cost(): Double {
        return  1.00 /*+ super.cost()*/
    }

    init {
        description = "Most Excellent Dark Roast"
    }
}