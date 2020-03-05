package com.jon.pattern.head.decorator

class HouseBlend:Beverage{
    override fun cost(): Double {
        return  0.89
    }

    constructor() : super(){
        description = "House Blend Coffee"
    }

}