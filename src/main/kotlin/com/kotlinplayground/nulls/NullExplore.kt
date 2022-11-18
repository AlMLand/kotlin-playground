package com.kotlinplayground.nulls

import kotlin.random.Random

data class Movie(var name: String, var id: Long? = null)

private fun Movie.save() = copy(id = if (id == null) Random.nextLong(1, 100) else id)

fun main() {
    val movie = Movie("a")
    val movieCopy = movie.save()
    println(movieCopy)
    println(movieCopy.save())
}
