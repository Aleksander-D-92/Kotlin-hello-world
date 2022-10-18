package com.example.gradlekotlin.tutorial.oop.Inharitance

interface MyInterface {
    val num: Int
    fun myFun(string: String): String
}

interface SubInterface : MyInterface {
    fun mySubFun(int: Int): String
}

class Something(override val num: Int = 12) : SubInterface {
    override fun myFun(string: String): String {
        TODO("Not yet implemented")
    }

    override fun mySubFun(int: Int): String {
        TODO("Not yet implemented")
    }
}
