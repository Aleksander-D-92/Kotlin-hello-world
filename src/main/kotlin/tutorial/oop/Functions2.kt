package com.example.gradlekotlin.tutorial.oop

fun upperFirstAndLast1(str: String): String {
    val temp = str.substring(0, 1).uppercase() + str.substring(1)
    return temp.substring(0, temp.length - 1) +
            temp.substring(temp.length - 1, temp.length).uppercase()
}

// static function, basically object in kotlin is an instance of class
// https://stackoverflow.com/questions/44255946/difference-between-a-class-and-object-in-kotlin
// Abc.sum(1,2)
// Abc.num
object Abc {
    val num = 12;
    fun sum(a: Int, b: Int): Int = a + b
}

// extension function can call it directly with string
// "aa".upperFirstAndLast()
fun String.upperFirstAndLast(): String {
    val temp = this.substring(0, 1).uppercase() + this.substring(1)
    return temp.substring(0, temp.length - 1) +
            temp.substring(temp.length - 1, temp.length).uppercase()
}
