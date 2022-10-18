package com.example.gradlekotlin.tutorial.oop

/*
* In Java, you can only have classes at top level, in kotlin you can have functions to
* public, private, protected, internal. If not specified it is public
* internal - visible inside of module
* private - visible inside the same file
* public - like java
* In Java 1 public class in a file, in Kotlin as many as you want
* all classes a public final by default
* static and new don't exist
*
*
* */
fun main() {
    val employee1 = Employee("aa");
    val employee2 = Employee("aa", true);
    val employee3 = Employee(employee1)
    listOf(employee1, employee2, employee3).forEach { println(it) }

}

//constructor(firstName: String) primary constructor
class Employee(private val firstName: String, private val fullTime: Boolean = false) {
    constructor(employee: Employee) : this(employee.firstName.uppercase(), !employee.fullTime)

    constructor(firstName: String) : this(firstName, false)
    constructor(fullTime: Boolean) : this("Default Name", fullTime)

    override fun toString(): String {
        return "Employee(firstName='$firstName', fullTime=$fullTime)"
    }
}

class Person {
    private val name: String;
    private val age: Int;

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    constructor() {
        this.name = "aa";
        this.age = 12;
    }

}
