package tutorial.practise

class Project(
    val name: String,
    val version: Int,
    val dependencies: ArrayList<String> = arrayListOf()
)

fun Project.addDependency(name: String) {
    val a = mutableListOf<Int>()
    this.dependencies.add(name)
    this.dependencies.map { it -> "aa" }

}

fun Project.addDependency2(action: (String) -> String) {
    this.dependencies.add(action.invoke("pesho"))
}

fun main() {
    val p = Project("aaa", 12)
    p.addDependency("pesho")
    p.addDependency2 { it -> "$it and aa" }
}

fun buz(input: String) {
    println("another message: $input")
}
