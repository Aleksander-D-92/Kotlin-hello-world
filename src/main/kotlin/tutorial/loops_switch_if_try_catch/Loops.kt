package tutorial.loops_switch_if_try_catch

fun main() {
    // range
    val range = 1..5
    range.forEach { println(it) }

    5.downTo(1).step(2).forEach { println(it) }

    for (i in 15 downTo 0 step 3) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    //ifs
    val num = if (2 < 3) 50 else 30
    val num2 = if (2 < 3) {
        50
    } else {
        40
    }

    // when = Java switch
    // try catch same as in Java, but it can evaluate and return like Java 17 swtich
}
