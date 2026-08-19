package com.vindroid.leetcode

fun main() {

    val givenNumbers = intArrayOf(1, 3, 4, 5, 1)
    val result = containsDuplicate(givenNumbers)
    if (result) println("list has duplicate numbers")
    else println("list has no duplicate numbers")
}

private fun containsDuplicate(givenNumbers: IntArray): Boolean {
    val seen = mutableSetOf<Int>()
    for (number in givenNumbers) {
        if (!seen.add(number)) return true
    }
    return false
}