package com.vindroid.leetcode

fun main() {
    val inputs = listOf("the sky is blue", "  hello world  ", "a good   example")
    for (input in inputs) {
        val result = reverseWords(input)
        println("Input: \"$input\"")
        println("Output: \"$result\"")
    }
}

private fun reverseWords(s: String): String {
    return s.trim()
        .split("\\s+".toRegex())
        .reversed()
        .joinToString(" ")
}
