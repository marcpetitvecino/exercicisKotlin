package com.example.demo.WhatShouldIDoToday

fun main(args: Array<String>) {

    println(whatShouldIDoToday("werewr","Rainy"))

}

fun whatShouldIDoToday(mood : String, weather : String = "Sunny", temperature : Int = 24) : String {

    return when  {

        mood == "happy" && weather == "Sunny" -> "Go for a walk"
        mood == "sad" && weather == "Cloudy" -> "Play computer games"
        weather == "Sunny" || temperature > 25 -> "It's hot outside"
        else -> "Stay home and read."

    }

}
