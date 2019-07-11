package com.example.demo.FitMoreFish

fun main(args: Array<String>) {

    println(canAddFish(10, listOf(3,3,3)))
    println(canAddFish(8, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9, listOf(1,1,3), 3))
    println(canAddFish(10, listOf(), 7, true))

}

fun canAddFish(tankSize : Int, currentFish : List<Int>, fishSize : Int = 2, hasDecorations : Boolean = true) : Boolean {

    if (hasDecorations) {

        return fishSize <= tankSize * 0.8 - currentFish.sum()

    }else {

        return fishSize <= tankSize - currentFish.sum().toDouble()

    }

}