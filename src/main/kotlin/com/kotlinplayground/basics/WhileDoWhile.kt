package com.kotlinplayground.basics

fun main() {
    val border = 6
    exploreWhile(border)
    println()
    exploreDoWhile(border)
}

fun exploreDoWhile(border: Int) {
    var count = 6
    do {
        print("dw:${count++} ")
    } while (count < border)
}

fun exploreWhile(border: Int) {
    var count = 6
    while (count < border) {
        print("w:${count++} ")
    }
}
