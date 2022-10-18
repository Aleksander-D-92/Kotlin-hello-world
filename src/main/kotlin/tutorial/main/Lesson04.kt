package com.example.gradlekotlin.tutorial

fun main() {
    val myLong = 22L

    val toInt = myLong.toInt()

    val myDouble = 63.976;
    val myFloat = myDouble.toFloat()
    println(myDouble.javaClass)
    println(myFloat.javaClass)

    val ch = 'b';
    val myCharInt = 65;
    println(myCharInt.toChar())

    listOf(1, 2, 3, 4).forEach { i -> println(i) }

    val str: String? = null;
    // doesn't throw null pointer
    str?.uppercase();
    // throws null pointer
    str!!.uppercase();
}
