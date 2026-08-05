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

    var currentSum = nums[0] //5
    var maxSum = nums[0]    //5

    for (i in 1 until nums.size) {//1,2,3,4
        val num = nums[i] //4,-1,7,8
        currentSum = maxOf(num, currentSum + num) //9,8,15,23
        maxSum = maxOf(maxSum, currentSum) //9,8,15,23
    }
    return maxSum //9,8,15,23
}