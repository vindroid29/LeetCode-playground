package com.vindroid.leetcode

fun main() {
//    Input: nums = [5,4,-1,7,8]
//    Output: 23
    val given = intArrayOf(5, 4, -1, 7, 8)
    val result = getLongestMaxSum(given)
    println("Maximum subarray sum is : $result")
}

private fun getLongestMaxSum(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var currentSum = nums[0]
    var maxSum = nums[0]

    for (i in 1 until nums.size) {
        val num = nums[i]
        currentSum = maxOf(num, currentSum + num)
        maxSum = maxOf(maxSum, currentSum)
    }
    return maxSum
}