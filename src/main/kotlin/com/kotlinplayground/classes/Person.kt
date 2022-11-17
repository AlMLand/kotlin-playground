package com.kotlinplayground.classes

class Person(private val name: String = "", private val age: Int = 0) {
    private var email: String = ""
    private var nameLength: Int = name.length

    // or
    private var nameLength2: Int

    init {
        nameLength2 = name.length
    }

    constructor(email: String, name: String = "", age: Int = 0) : this(name, age) {
        this.email = email
    }

    fun action() = println("Person ${if (name == "") "no name" else name} walks")
    override fun toString(): String =
        "Person(name:$name, age:$age, email:$email, nameLength2:$nameLength2, nameLength:$nameLength)"
}

fun main() {
    val personDefault = Person()
    println(personDefault)
    val person = Person("Alex", 37)
    println(person)
    val personWithNameAgeEmail = Person("test@gmail.com", "Timur", 5)
    println(personWithNameAgeEmail)
    val personWithEmail = Person(email = "test@gmail.com")
    println(personWithEmail)
}