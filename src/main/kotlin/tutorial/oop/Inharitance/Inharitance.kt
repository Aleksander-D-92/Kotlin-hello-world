package com.example.gradlekotlin.tutorial.oop.Inharitance

// open - the class can be extended, also for functions
// abstract - makes open redundant

fun main() {
    val laserPrinter = LaserPrinter("m1", 50)
    laserPrinter.printModel()
}

abstract class Printer(val model: String) {
    open fun printModel() = println("Model: $model")

    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(model: String, val age: Int) : Printer(model) {
    override fun printModel() = println("Subclass Model: $model, $age")
    override fun bestSellingPrice() = 12.99
}

class SpecialLaserPrinter(model: String, age: Int) : LaserPrinter(model, age)


