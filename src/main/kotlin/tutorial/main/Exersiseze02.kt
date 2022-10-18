package com.example.gradlekotlin.tutorial

fun main() {
    val f1 = -3847.384F
    val f2 = (-3847.384).toFloat();

    var f3: Float? = -3847.384F
    var f4: Float? = (-3847.384)?.toFloat();


    val shortArr = ShortArray(5)
    repeat(5) {
        shortArr[it] = it.toShort()
    }
    shortArr.forEach { print("$it, ") }

    println()

    val arr1 = Array<Int?>(40) { i -> (i + 1) }
    val arr2 = List<Int?>(40) { it + 1 }

    val intArr = arrayOfNulls<Int?>(40)
    var num = 5;
    repeat(40) {
        intArr[(num / 5) - 1] = num;
        num += 5;
    }
    intArr.forEach { print("$it, ") }

    println()

    val x: String? = "I AM IN UPPERCASE"

    val y = x?.uppercase() ?: "str val";

}
