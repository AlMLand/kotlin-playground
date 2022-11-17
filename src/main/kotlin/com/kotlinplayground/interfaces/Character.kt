package com.kotlinplayground.interfaces

enum class Character(private val ch: Char) {
    A('X'), B('Y');

    fun customGetValue() = ch
}

fun main() {
    println(Character.B.name)
    println(Character.B.customGetValue())
}