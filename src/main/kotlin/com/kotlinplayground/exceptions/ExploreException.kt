package com.kotlinplayground.exceptions

private const val city = "Dresden"

fun main() {
    println(textLength(city))
    println(textLength(null))
}

fun textLength(text: String?) = try {
    text!!.length
} catch (exception: NullPointerException) {
    println("Exception is occurred: $exception")
    null
}
