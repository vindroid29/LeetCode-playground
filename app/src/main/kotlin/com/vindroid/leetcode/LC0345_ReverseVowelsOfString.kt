package com.vindroid.leetcode

fun main() {
//  Input: s = "IceCreAm"
//  Output: "AceCreIm"
    val given = "IceCreAm"

    val result = reverseVowels(given)
    println("input : $given")
    println("output : $result")

}

private fun reverseVowels(s: String): String {
    val chArray = s.toCharArray()
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var start = 0
    var end = s.lastIndex

    while (start < end) {
        while (start < end && !vowels.contains(chArray[start])) {
            start++
        }
        while (start < end && !vowels.contains(chArray[end])) {
            end--
        }
        val temp = chArray[start]
        chArray[start] = chArray[end]
        chArray[end] = temp
        start ++
        end--
    }

    return String(chArray)
}