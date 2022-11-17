package com.kotlinplayground.classes

import com.kotlinplayground.classes.TestUser.TestUserFabric.getNameLength

object Authenticate {
    fun authenticate(login: String, password: String) {
        println("The user with a login: $login, password: $password")
    }
}

class TestUser private constructor(private val name: String) {
    companion object TestUserFabric {
        fun createTestUser(name: String) = TestUser(name)
        fun TestUser.getNameLength() = name.length
    }

    fun printName() = println(name)
}

fun main() {
    Authenticate.authenticate("AA", "BB")
    val user = TestUser.createTestUser("Alex")
    user.printName()
    println(user.getNameLength())
}