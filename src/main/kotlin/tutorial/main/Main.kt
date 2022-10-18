package tutorial.main

typealias  EmployeeSet = Set<Employee>
// missing keywords - new, static, throws, for I loops

// if we have only one fun the compiler will generate the class
// top level function, because it's outside a class
// wrappers  println("Hello world") = System.out.println(message)
// typealias  EmployeeSet = Set<Employee>
/*
val employees: EmployeeSet = setOf(employee1, employee2);
val employees2: Set<Employee> = setOf(employee1, employee2);
* */
// Any something like Object in java
// in kotlin == just calls .equals()
// in kotlin === referential equality

// InstanceOf casting
// num2 = "11"
// if (num2 is String) {num2}
fun main(args: Array<String>) {
    println("Hello world")
    val number = 12;

    val employee1 = Employee("Lynn Jones", 500);
    val employee2 = Employee("AAAA VVVV", 20);
    val employee3 = Employee("AAAA VVVV", 20);

    val employees: EmployeeSet = setOf(employee1, employee2, employee3);
    val employees2: Set<Employee> = setOf(employee1, employee2, employee3);
    for (employee in employees) {
        println(employee)
    }
    employees.filter { it.id < 200 }.map { it.id * 100 }.forEach { println(it) }

    println(employee1.javaClass)
    println(Any().javaClass)
    println(employee3 == employee2)
    println(employee3 === employee2)
    println(employee3 != employee2)
    println(employee3 !== employee2)

}

class Employee(var name: String, val id: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Employee

        if (name != other.name) return false
        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + id
        return result
    }

    override fun toString(): String {

        return "Employee(name='$name', id=${id + 12})"
    }
}


