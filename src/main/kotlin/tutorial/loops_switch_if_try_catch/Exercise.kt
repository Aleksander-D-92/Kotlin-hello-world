package tutorial.loops_switch_if_try_catch

fun main() {
//    for (i in 1..5000 step 5) {
//        println(i)
//    }
//    for (i in -500..0 step 1) {
//        println(i)
//    }
    var counter = 0;
    for (i in 1..5) {
        println(i)
        if (counter >= 3) break;
        for (j in 11..20) {
            if (counter >= 3) break;
            println(j)
            for (k in 100 downTo 90) {
                if (counter >= 3) break;
                counter++;
                println(k)
            }
        }
    }
    val num = (-200..200).random()
    val dNum: Int = when {
        num > 100 -> -200
        num < 100 -> 200
        else -> 0
    }

    val dNum2 = if (num > 100) {
        200
    } else if (num < 100) {
        -200
    } else {
        100
    }
}
