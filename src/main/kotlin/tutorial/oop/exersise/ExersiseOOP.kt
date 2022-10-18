package tutorial.oop.exersise

open class Bicycle(var cadence: Int, var gear: Int? = 10, var speed: Int) {
    fun applyBrake(decrement: Int) {
        this.speed -= decrement
    }

    fun speedUp(increment: Int) {
        this.speed += increment
    }

    open fun printDescription(): String {
        return "Bicycle(cadence=$cadence, gear=$gear, speed=$speed)"
    }
}

class MountainBike(var seatHeight: Int, cadence: Int, gear: Int? = 15, speed: Int) : Bicycle(cadence, gear, speed) {
    constructor(color: String) : this(1, 2, 3, 4) {
        println(color)
    }

    override fun printDescription(): String {
        return "MountainBike seatHeight=$seatHeight ${super.printDescription()}"
    }
}

class RoadBike(val tireWidth: Int, cadence: Int, gear: Int? = 20, speed: Int) : Bicycle(cadence, gear, speed) {
    override fun printDescription(): String {
        return "RoadBike tireWidth=$tireWidth ${super.printDescription()}"
    }
}

fun main() {
    val b = Bicycle(1, 2, 3)
    val b2 = Bicycle(cadence = 1, speed = 3)
    val mb = MountainBike(1, 2, 3, 4)
    val mb2 = MountainBike(cadence = 1, speed = 3, seatHeight = 5)
    val rb = RoadBike(1, 2, 3, 4)
    mb.applyBrake(20)
    rb.speedUp(20)
    listOf(b, b2, mb, mb2, rb).forEach { println(it.printDescription()) }
}
