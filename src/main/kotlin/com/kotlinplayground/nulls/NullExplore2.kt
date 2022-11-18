package com.kotlinplayground.nulls

private var nameNullable: String? = null

private fun getLengthNullable(nameNullable: String?) {
    println("the length: ${nameNullable?.length ?: "this string is null"}")
}

private fun getLength(name: String) {
    println("the length: ${name.length}")
}


fun main() {
    getLengthNullable(nameNullable)
    
    nameNullable = "12345"
    nameNullable?.let { getLength(it) }
    nameNullable?.run { getLength(this) }

    nameNullable = "Ti"
    getLengthNullable(nameNullable)
}
