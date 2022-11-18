package com.kotlinplayground.scopefunctions

private val messageNull: String? = null
private val message = "message"

fun main() {
    println("message length: ${messagePerform(message) { x -> x.length }}")
    println("message length: ${messagePerform(messageNull) { x -> x.length }}")
    println(messagePerform(message) { x -> x.uppercase() })

    val integers = mutableListOf<Int>()
    populateList(integers, 1, 2, 3, 4, 5)
    println("\nintegers: $integers")
}

fun <T, R> messagePerform(message: T?, action: (T) -> R) =
//    action(message.takeIf { it != null } ?: "")
    message?.let { action(it) } ?: -1

private fun <T> populateList(list: MutableList<T>, vararg element: T) {
    with(list) {
        element.forEach { this.add(it) }
    }
}

private val doubles = mutableListOf<Double>()
    // also -> dlja dopolnitelnoj storonnej logiki
    .also { println("start populating the list") }
    // apply -> dlja inicializacii objecta
    .apply {
        add(2.2)
        add(3.3)
        add(1.1)
    }
    .also { println("end populating the list") }
    .sorted()
    // let -> dlja wizowa odnoj ili neskolkih funkcij po rezultatam predschestwujuschej zepochki
    .let {
        println("$it sum all doubles: ${it.sum()}")
    }

