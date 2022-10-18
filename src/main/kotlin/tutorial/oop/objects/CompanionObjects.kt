package tutorial.oop.objects

// Only one companion object is allowed per class
//  They can access private constructors
fun main() {
    println(SomeClass.SomeName.accessPrivateVar())

    listOf(SomeClass.justAssign("pesho"), SomeClass.upperOrLower("pesho", false))
        .forEach { println(it.someStr) }
}

// Factory Pattern
// Also you can use it for singleton
class SomeClass private constructor(val someStr: String) {


    companion object SomeName {
        private const val privateVal = 6;
        fun accessPrivateVar() = privateVal
        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLower(str: String, lower: Boolean): SomeClass {
            return if (lower) SomeClass(str.lowercase()) else SomeClass(str.uppercase())
        }
    }
}

// static function, basically object in kotlin is an instance of class
// https://stackoverflow.com/questions/44255946/difference-between-a-class-and-object-in-kotlin
// Abc.sum(1,2)
// Abc.num
object Abc {
    val num = 12;
    fun sum(a: Int, b: Int): Int = a + b
}
