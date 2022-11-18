package com.kotlinplayground.collections

private val list = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))
private val courses = courseList()

fun main() {
    val list2 = list.map { outerList -> outerList.map { it.toDouble() } }
    println(list2)

    val list3 = list.flatMap { it.toList() }.map { it.toDouble() }
    println(list3)

    val list4 = list.flatMap { outerList -> outerList.map { it.toDouble() } }
    println(list4)

    val topicsByKafka1 = courses.filter { it.topicsCovered.contains(KAFKA) }.map { it.name }
    topicsByKafka1.forEach { println(it) }

    val topicsByKafka2 = courses.flatMap {
        val courseName = it.name
        it.topicsCovered.filter { topic -> topic == KAFKA }.map { courseName }
    }
    topicsByKafka2.forEach { println(it) }
}