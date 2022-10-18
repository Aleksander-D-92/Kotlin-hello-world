package com.example.gradlekotlin.tutorial

fun main() {
    val hello1 = "hello"
    val hello2 = "hello"
    println(hello1 === hello2)
    println(hello1 == hello2)
    var num = 2988
    var num2: Any
    num2 = "11"
    if (num2 is String) {
        num2
    }
    println(num2.toInt().javaClass)


    listOf(1, 11, 111, 1111).forEach { println(it.toString()) }
}
