package com.example.demo.Test

import java.util.*

fun main(args: Array<String>) {

    println("Hello ${args[0]}")
    feedTheFish()

}

fun getDirtySensorReading() = 20

fun shouldChangeWater (
        day: String,
        temperature: Int = 22,
        dirty: Int = getDirtySensorReading()) : Boolean  { // Es pot assignar una funció com a parametre per defecte d'una altre funcio

    val isTooHot : Boolean = temperature > 30
    val isDirty : Boolean = dirty > 30
    val isSunday : Boolean = day == "Sunday"

    return when {

        isTooHot -> true
        isDirty -> true
        isSunday -> true
        else -> false

    }

}

var dirty = 20

val waterFilter : (Int) -> Int = { dirty -> dirty / 2}
fun feedFish(dirty : Int) = dirty + 10

fun updateDirty(dirty : Int, operation : (Int) -> Int) : Int {

    return operation(dirty)

}

fun dirtyProcessor() {

    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty, { dirty -> dirty + 50})

}



fun isTooHot (temperature : Int) = temperature > 30 // No fa falta declarar el tipus si s'enten la variable
fun isDirty (dirty : Int) = dirty > 30
fun isSunday (day: String) = day == "Sunday"


fun feedTheFish() {

    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    if (shouldChangeWater(day)) {

        println("Change the water today")

    }

    swim(50, speed = "slow")
}

fun swim(time: Int, speed: String = "fast") {

    println("swimming $speed")

}

fun fishFood(day : String) : String {

    return when (day) {

        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"

    }

}

fun randomDay() : String {

    val week = listOf("Monday", "Tueday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]

}