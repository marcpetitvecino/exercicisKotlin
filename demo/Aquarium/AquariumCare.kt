package com.example.demo.Aquarium

fun main(args : Array<String>) {

    val symptoms = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")

    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    symptoms.contains("red")
    symptoms.contains("red spots")

    println(symptoms.subList(4, symptoms.size))

    listOf(1, 5, 3).sum()

    listOf("a", "b", "cc").sumBy { it.length }

    val cures = mapOf("white spots" to "Ich", "red sores" to "hole disease")

    println(cures.get("white spots"))
    println(cures["white spots"])

    println(cures.getOrDefault("bloating", "sorry i don't know"))

    cures.getOrElse("bloating") {"No cure for this"}

    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    inventory.remove("fish net")

}