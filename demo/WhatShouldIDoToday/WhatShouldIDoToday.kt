package com.example.demo.WhatShouldIDoToday

fun main(args: Array<String>) {


    println(whatShouldIDoToday(getMood(), "Cloudy"))

}

fun imHappy() = "happy"
fun imSad() = "sad"
fun itsSunny() = "Sunny"
fun itsCloudy() = "Cloudy"
fun itsHot() = 25

fun whatShouldIDoToday(mood : String, weather : String = "Sunny", temperature : Int = 24) : String {

    return when  {

        mood == imHappy() && weather == itsSunny() -> "Go for a walk"
        mood == imSad() && weather == itsCloudy() -> "Play computer games"
        weather == itsSunny() || temperature > itsHot() -> "It's hot outside"
        else -> "Stay home and read."

    }

}

fun getMood() : String {

    println("How do you feel today?")
    return readLine()!!.toString()

}