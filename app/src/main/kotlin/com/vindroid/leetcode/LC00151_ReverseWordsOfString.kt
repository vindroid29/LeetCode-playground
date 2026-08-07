package com.vindroid.leetcode

fun main() {
    val inputs = listOf("the sky is blue", "  hello world  ", "a good   example", "a")
    for (input in inputs) {
        val result = reverseWords(input)
        println("Input: \"$input\"")
        println("Output: \"$result\"\n")
    }
}

private fun reverseWords(s: String): String {
    val chars = s.toCharArray()
    chars.reverse(0, s.lastIndex)
    val builder = StringBuilder()
    var left = 0

    while (left < chars.size) {
        while (left < chars.size && chars[left] == ' ') left++
        if (left >= chars.size) break

        var right = left
        while (right < chars.size && chars[right] != ' ') right++

        chars.reverse(left, right - 1)

        if (builder.isNotEmpty()) builder.append(' ')

        for (i in left until right) {
            builder.append(chars[i])
        }
        left = right
    }
    return builder.toString()
}

fun CharArray.reverse(left: Int, right: Int) = run {
    var l = left
    var r = right
    while (l < r) {
        val temp = this[l]
        this[l] = this[r]
        this[r] = temp
        l++
        r--
    }
}
