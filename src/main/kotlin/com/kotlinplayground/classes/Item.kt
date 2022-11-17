package com.kotlinplayground.classes

class Item() {
    var name: String = ""
        get() = field
        set(value) {
            field = value
        }
    var price: Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    constructor(name: String) : this() {
        this.name = name
    }

    override fun toString(): String = "Item(name:$name)"
}

fun main() {
    val item1 = Item()
    println(item1)
    val item2 = Item("testName")
    println(item2)
    println("item2 name: ${item2.name} | item2 price: ${item2.price}")
    item2.price = 1.1
    println("item2 name: ${item2.name} | item2 price: ${item2.price}")
}