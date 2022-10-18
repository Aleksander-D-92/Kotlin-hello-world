package com.example.gradlekotlin.tutorial.oop

fun main() {
    val a = Student();
    a.fullTime;
    val car = Car("blue", 11);
    car.color
    val copy = car.copy("Green")
    println(car)
    println(copy)
}

// Getters And Setters have to have same visibility as the property
// if you want a property to be modified it must not be private
// https://stackoverflow.com/questions/56719542/what-are-the-differences-between-kotlin-class-properties-and-java-class-fields
class Student(private val firstName: String = "pesho", fullTime: Boolean = false) {
    var fullTime = fullTime
        get() {
            return field;
        }
        set(value) {
            field = value
        }
}

// data class has equals, hashcode and toString and copy functions
data class Car(val color: String, val year: Int) {
    constructor(car: Car) : this(car.color, car.year)
}
