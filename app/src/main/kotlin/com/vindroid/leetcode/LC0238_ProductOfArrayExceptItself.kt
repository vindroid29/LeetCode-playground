package com.vindroid.leetcode

fun main() {
//    Input: nums = [1,2,3,4]
//    Output: [24,12,8,6]

    val input = intArrayOf(1, 2, 3, 4)
    val result = getProductArray(input)
    println("Input : ${input.contentToString()}")
    println("Output : ${result.contentToString()}")

}

private fun getProductArray(nums: IntArray): IntArray {
    if (nums.isEmpty()) return intArrayOf()
    val result = IntArray(nums.size)
    var product = 1

    for (i in nums.indices) {
        result[i] = product
        product *= nums[i]
    }

    product = 1
    for (i in nums.lastIndex downTo 0) {
        result[i] *= product
        product *= nums[i]
    }
    return result
}