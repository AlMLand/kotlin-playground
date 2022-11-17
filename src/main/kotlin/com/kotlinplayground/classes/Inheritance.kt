package com.kotlinplayground.classes

open class User(private val name: String) {
    open val isLoggedIn: Boolean = false
    fun printName() = println(name)
    open fun logging() = println("logging from USER class")
}

class Student(name: String) : User(name) {
    override var isLoggedIn: Boolean = true

    companion object {
        const val noOfEnrolledCourses = 10
        fun getCountry() = "USA"
    }

    override fun logging() = println("logging from STUDENT class. ISLOGGEDIN: $isLoggedIn")
}

class Instructor(name: String) : User(name) {
    override var isLoggedIn: Boolean = true
    override fun logging() = println("logging from INSTRUCTOR class. ISLOGGEDIN: $isLoggedIn")
}


fun main() {
    val student = Student("Alex")
    val instructor = Instructor("Timur")
    getStInName(student)
    getStInName(instructor)
    student.getStInName2()
    instructor.getStInName2()
}

fun <T : User> getStInName(obj: T) = obj.printName()
fun User.getStInName2() = printName()
