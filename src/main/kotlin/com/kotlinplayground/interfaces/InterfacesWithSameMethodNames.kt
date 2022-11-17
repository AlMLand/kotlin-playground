package com.kotlinplayground.interfaces

interface A {
    fun makeWhat() = "A"
}

interface B {
    fun makeWhat() = "B"
}

class AB : A, B {

    override fun makeWhat(): String {
        val variableA = super<A>.makeWhat()
        val variableB = super<B>.makeWhat()
        return "A: $variableA | B: $variableB"
    }

}

fun main() {
    println(AB().makeWhat())
}