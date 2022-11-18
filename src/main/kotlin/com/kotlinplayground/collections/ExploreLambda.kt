package com.kotlinplayground.collections

private fun lambdaFunction(x: Int, y: Int, action: (Int, Int) -> Int) = action(x, y)

fun main() {
    println({ x: Int -> x + x + x * x }(2))
    println(lambdaFunction(2, 3) { x, y -> x + x + x * x + y })
}
