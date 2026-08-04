package com.vindroid.leetcode

fun main() {

    val word1 = "ab"
    val word2 = "pqrs"

    val result = mergeAlternately(word1, word2)
    println("Merged String : $result")

}

private fun mergeAlternately(word1: String, word2: String): String {

    val stringBuilder = StringBuilder()

    val minLength = minOf(word1.length, word2.length)

    for (i in 0 until minLength) {
        stringBuilder.append(word1[i]).append(word2[i])
    }

    if (word1.length > minLength) {
        stringBuilder.append(word1, minLength, word1.length)
    }
    if (word2.length > minLength) {
        stringBuilder.append(word2, minLength, word2.length)
    }
    return stringBuilder.toString()
}
