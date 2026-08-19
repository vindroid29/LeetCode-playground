package com.vindroid.leetcode

fun main() {
//  Input: numbers = [2,7,11,15], target = 9
//  Output: [1,2]
    val given = intArrayOf(2, 7, 11, 15)
    val target = 9

    val result = twoSum(given, target)
    println("Input ${given.contentToString()} target : $target")
    println("Output ${result.contentToString()}")
}

private fun twoSum(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.lastIndex
    while (left < right) {
        val sum = numbers[left] + numbers[right]
        if (sum == target) return intArrayOf(left + 1, right + 1)
        if (sum < target) {
            left++
        } else right--
    }
    return intArrayOf()
}