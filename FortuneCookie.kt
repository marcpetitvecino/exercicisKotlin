package com.example.demo.FortuneCookie

fun main(args: Array<String>) {


    println("Your good fortune is: ${getFortuneCookie(getBirthday())}")

}

fun getFortuneCookie(birthday : Int) : String {

    val list = arrayOf("You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.", "Be humble and all will turn out well.", "Today is a good day for exercising restraint.", "a", "b")


    return when (birthday) {

        28, 31 -> "28, 31"
        in 1..7 -> "1 to 7"
        else -> list[birthday!! % list.size]

    }

}

fun getBirthday() : Int {

    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1

}

