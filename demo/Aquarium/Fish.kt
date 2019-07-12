package com.example.demo.Aquarium

class Fish (val friendly : Boolean = true, volumeNeeded : Int) {

    val size : Int = if (friendly) {

        volumeNeeded

    } else {

        volumeNeeded + 2

    }

    init {

        println("First init block")

    }

    constructor() : this(true, 9) {

        println("Running secondary constructor")

    }

    init {

        println("Constructed fish of size $volumeNeeded final size ${this.size}")

    }

    init {

        println("last init block")

    }

}

fun makeDefaultFish() = Fish(true, 50)

fun fishExample() {

    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needs more volume ${fish.size}")

}