package com.vindroid.leetcode

fun main() {
    //Input: s = "abc", t = "ahbgdc" Output: true
    //Input: s = "axc", t = "ahbgdc" Output: false
    val s = "abc";
    val t = "ahbgdc"
    val result = isSubsequence(s, t)
    println("Input s:$s, t:$t")
    println("Output : $result")
}

private fun isSubsequence(s: String, t: String): Boolean {
    var i = 0
    var j = 0
    while (i < s.length && j < t.length) {
        if (s[i] == t[j]) {
            i++
            j++
        } else j++
    }
    return i == s.length
}