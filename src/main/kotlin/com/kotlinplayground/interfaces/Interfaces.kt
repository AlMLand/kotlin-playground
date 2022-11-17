package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

interface CourseRepository {
    val repeatable: Boolean
        get() = true
    val isCoursePersisted: Boolean
    fun getById(id: Int): Course
    fun save(course: Course): Int {
        println("course with id: ${course.id} is saved")
        return course.id
    }
}

class SqlCourseRepository() : CourseRepository {
    override var isCoursePersisted: Boolean = false
    override fun getById(id: Int): Course = Course(id, name = "", author = "")
    override fun save(course: Course): Int {
        println("extra logic")
        isCoursePersisted = true
        return super.save(course)
    }
}

fun main() {
    val scr = SqlCourseRepository()
    println(scr.isCoursePersisted)
    println(scr.repeatable)
}