package com.vindroid.leetcode

fun main() {
    //Input: s = "leetcode", k = 3
    //Output: 2
    val s = "leetcode"; val k = 3
    val result = getMaxVowels(s,k)
    println("Input : s:$s, k:$k")
    println("Output : $result")
}

private fun getMaxVowels(s: String, k: Int): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var currentVowels = 0
    for (i in 0 until k) {
        if (vowels.contains(s[i])) currentVowels++
    }
    var maxVowels = currentVowels
    for (i in k until s.length){
        if(vowels.contains(s[i])) currentVowels++
        if(vowels.contains(s[i-k])) currentVowels--
        maxVowels = maxOf(maxVowels,currentVowels)
    }
    return maxVowels
}
