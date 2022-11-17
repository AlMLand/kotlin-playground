package com.kotlinplayground.classes

data class Course(val id: Int, val name: String, val author: String)

fun main() {
    val course = Course(1, "testName", "Alex")
    val courseCopy = course.copy(id = 2)
    println(course == courseCopy)
}