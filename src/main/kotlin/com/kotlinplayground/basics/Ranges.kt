package com.kotlinplayground

val range1 = 1..3
val range2 = 1 until 3
val range3 = 'a'..'z'
val range4 = 'z' downTo 'a'

fun main() {
    range1.forEach { print("$it") }
    println()

    range2.forEach { print("$it") }
    println()

    range3.forEach { print("$it") }
    println()

    (range3 step 2).forEach { print(it) }
    println()

    for ((index, element) in range3.withIndex().reversed())
        print("${index + 1}:$element ")
    println()

    for ((index, element) in (range3 step 2).withIndex())
        print("${index + 1}:$element ")
    println()

    for ((index, element) in range4.withIndex())
        print("${index + 1}:$element ")
}
