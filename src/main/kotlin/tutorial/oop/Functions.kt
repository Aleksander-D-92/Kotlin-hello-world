package com.example.gradlekotlin.tutorial.oop

fun main() {

    val str = multiply(1, 2)
    println(str)
    println(multiply(label = "Custom Label", x = 12, y = 3))

    val w = Worker("Jane");
    println(w.upperCaseFirstLater())

    printNames(Worker("pesho"), Worker("gosho"))

    println("pesho".upperFirstAndLast())
}

// shortcut syntax
fun whatever() = 3 * 4
fun multiply(x: Int, y: Int, label: String = "Default Label") = "$label ${x + y}"

// can't have multiple varargs
fun printNames(vararg workers: Worker) = workers.forEach { println(it.firstName) }

class Worker(val firstName: String) {
    fun upperCaseFirstLater() = firstName.uppercase();
}
