package com.vindroid.leetcode

fun main() {
    val str1 = "anagram"
    val str2 = "mganata"
    val result = isAnagram(str1, str2)

    println("given strings are : $result")
}

private fun isAnagram(s: String, t: String): Boolean {

    if (s.length != t.length) return false

    val frequency = mutableMapOf<Char, Int>()
    for (ch in s) {
        frequency[ch] = frequency.getOrDefault(ch, 0) + 1
    }
    for (ch in t) {
        frequency[ch] = frequency.getOrDefault(ch, 0) - 1

        if (frequency[ch]!! < 0) {
            return false
        }
    }
    return true
}