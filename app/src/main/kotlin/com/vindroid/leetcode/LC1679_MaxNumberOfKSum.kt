package com.vindroid.leetcode

fun main() {
    //Input: nums = [1,2,3,4], k = 5
    //Output: 2
    val given = intArrayOf(3, 1, 2, 4, 3)
    val k = 6
    val result = maxOperations(given, k)
    println("Input: nums: ${given.contentToString()}, k: $k")
    println("Output: $result")
}

private fun maxOperations(nums: IntArray, k: Int): Int {
    nums.sort()
    var left = 0
    var right = nums.lastIndex
    var pairCount = 0
    while (left < right) {
        val sum = nums[left] + nums[right]
        if (sum == k) {
            left++
            right--
            pairCount++
        } else if (sum < k) left++
        else right--
    }
    return pairCount
}