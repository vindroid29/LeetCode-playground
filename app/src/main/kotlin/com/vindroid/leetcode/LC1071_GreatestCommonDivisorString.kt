package com.vindroid.leetcode

fun main() {
//    Input: str1 = "ABCABC", str2 = "ABC"
//    Output: "AB"
    val str1 = "ABCABC"
    val str2 = "ABC"
    println("Input: str1=$str1 str2=$str2")
    val result = gcdOfStrings(str1, str2)
    println("Output: $result")
}

private fun gcdOfStrings(str1: String, str2: String): String {
    if (str1 + str2 != str2 + str1) return ""
    val gcd = gcd(str1.length, str2.length)
    return str2.substring(0, gcd)
}

private fun gcd(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val rem = x % y
        x = y
        y = rem
    }
    return x
}