package com.vindroid.leetcode


fun main() {
//Input: nums = []
//Output: [1,3,12,0,0]
    val given = intArrayOf(0, 1, 0, 3, 12)
    val result = moveZeros(given)
    println("result : ${result.contentToString()}")
}

private fun moveZeros(nums: IntArray): IntArray {
    var write = 0
    for (i in nums.indices) {
        val num = nums[i]
        if (num != 0) {
            val temp = nums[write]
            nums[write] = nums[i]
            nums[i] = temp
            write++
        }
    }
    return nums
}