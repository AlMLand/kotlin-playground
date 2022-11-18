package com.kotlinplayground.collections

private val courses = courseList()

fun main() {
    val courseNames = mapCourses(courses) { course -> course.name } as List<String>
    courseNames.forEach { println(it) }

    mapAndActionCourses(courses, mapping = { it.name }, action = { println(it) })

    val namesCategory = mapCourses(courses) { it.name to it.category } as List<Pair<String, CourseCategory>>
    namesCategory.forEach { println(it) }

    filterFlatMapAction(
        courses, predicate = { it.name.length > 60 }, flat = { it.toList() },
        mapping = { it.length }, action = { print("$it ") }
    )
}

private fun mapCourses(courses: MutableList<Course>, mapping: (Course) -> Any) = courses.map(mapping)

private fun mapAndActionCourses(courses: MutableList<Course>, mapping: (Course) -> Any, action: (Any) -> Unit) =
    courses
        .map(mapping)
        .forEach(action)

private fun filterFlatMapAction(
    courses: MutableList<Course>, predicate: (Course) -> Boolean,
    flat: (List<String>) -> List<String>, mapping: (String) -> Any, action: (Any) -> Unit
) = courses
    .filter { predicate(it) }
    .flatMap { flat(it.topicsCovered) }
    .map(mapping)
    .forEach(action)