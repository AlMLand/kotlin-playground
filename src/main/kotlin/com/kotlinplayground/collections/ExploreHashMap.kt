package com.kotlinplayground.collections

enum class Status(private val status: Int) {
    NOT_FOUND(404), DEFAULT_VALUE(1000);

    fun getStatusNumber() = status
}

private val nameAgeMap = mutableMapOf("A".repeat(2) to 37, "E".repeat(3) to 36)

private fun <T : Map<String, Int>> customPrint(map: T? = null) {
    val currentMap = map ?: nameAgeMap
    currentMap
        .forEach { print("${it.key} = ${it.value} ${if (currentMap.keys.last() == it.key) "\n" else "  <||>  "}") }
}

fun main() {
    customPrint<Nothing>()

    nameAgeMap["T".repeat(4)] = 7
    customPrint<Nothing>()

    nameAgeMap.getOrPut("X") { Status.DEFAULT_VALUE.getStatusNumber() }
    customPrint<Nothing>()

    println(nameAgeMap.getOrElse("L") { Status.NOT_FOUND })

    customPrint(nameAgeMap.filterKeys { it.length > 3 })

    println(nameAgeMap.keys.toSortedSet(compareBy { it.length }).last())

    val entry = nameAgeMap.maxByOrNull { it.value }
    println(entry?.key ?: Status.NOT_FOUND)
}


