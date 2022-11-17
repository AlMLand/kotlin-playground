package com.kotlinplayground.basics

import java.time.LocalDateTime
import java.time.format.DateTimeFormatterBuilder
import java.util.*

private const val ALEX = "Alex"
private val start = LocalDateTime.of(2022, 12, 1, 9, 0)

fun main() {
    printData(name = ALEX, start = start)
}

private fun printData(
    name: String, district: String = "DE",
    start: LocalDateTime = LocalDateTime.now()
) =
    println(
        """
        The name : $name
        The district : $district
        The start : ${
            start.customFormat()
        }
    """.trimIndent()
    )

private fun LocalDateTime.customFormat() =
    format(
        DateTimeFormatterBuilder()
            .appendLiteral("am ")
            .appendPattern("dd/MM/yyyy")
            .appendLiteral(" um ")
            .appendPattern("hh:mm")
            .appendLiteral(" Uhr")
            .toFormatter(Locale.GERMANY)
    )
