package com.kotlinplayground.collections

private val courses = courseList()

fun main() {

    courses.filter { it.category == CourseCategory.DEVELOPMENT }.forEach { println(it) }

    filterCourses(
        courses,
        predicate = { it.category == CourseCategory.DESIGN },
        action = { println(it) })

    val developmentCourses = mutableListOf<Course>()
    filterCourses(
        courses,
        predicate = { it.category == CourseCategory.DEVELOPMENT },
        action = { developmentCourses.add(it) }
    )
    println("the developer courses count: ${developmentCourses.size}")

}

private fun filterCourses(courses: MutableList<Course>, predicate: (Course) -> Boolean, action: (Course) -> Unit) {
    courses.filter(predicate).forEach(action)
//    courses.filter { predicate(it) }.forEach { action(it) }
}