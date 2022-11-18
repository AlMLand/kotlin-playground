package com.kotlinplayground.collections

private val range = 1..10_000_000

fun main() {
    val start = System.currentTimeMillis()

//    val listDoubles = range.map { it.toDouble() }.filter { it > 5_000_000 }
    val listDoubles = range.asSequence()
        .map { it.toDouble() }.take(50).filter { it > 5_000_000 }.toList()

    val end = System.currentTimeMillis() - start
    println(end)
}