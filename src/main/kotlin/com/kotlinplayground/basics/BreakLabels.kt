package com.kotlinplayground.basics

val range = 'a'..'g'
const val breakBorder = 2
val rangeInt = 1..3

fun main() {
    printCharactersBreak(range)
    printCharactersContinue(range)
    println("\n")
    printCharactersLabel(rangeInt, breakBorder)
    println()
    printCharactersReturnOrBreak(range)
}

fun printCharactersReturnOrBreak(range: CharRange) {
    range.forEach forEach@{
        // polnostju vihodit iz forEach
        // if (it == 'd') return
        // propuskaet etot element i idet dalsche po elementam
        if (it == 'd') return@forEach
        print("fr:$it ")
    }
}


fun printCharactersLabel(range: IntRange, breakBorder: Int) {
    outerLoop@ for (outerElement in range) {
        print("outerLoop$outerElement ")
        innerLoop@ for (innerElement in range) {
            print("innerLoop$innerElement ")
            //if (innerElement == breakBorder) break@outerLoop
            if (innerElement == breakBorder) continue@outerLoop
        }
        println("\nend of innerLoop Nr.: $outerElement")
    }
}

fun printCharactersContinue(range: CharRange) {
    for (character in range) {
        if (character == 'd') continue
        print("$character ")
    }
}

fun printCharactersBreak(range: CharRange) {
    for (character in range) {
        if (character == 'd') break
    }
    println("break go out only from loop, not from method")
}
