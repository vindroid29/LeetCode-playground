package com.vindroid.leetcode

fun main() {
//    Input: nums = [-1,0,1,2,-1,-4]
//    Output: [[-1,-1,2],[-1,0,1]]
    val given = intArrayOf(-1, 0, 1, 2, -1, -4)

    val result = threeSum(given)
    println("Input : ${given.contentToString()}")
    println("Output : ${result.joinToString(",")}")
}

private fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    nums.sort()

    for (i in 0 until nums.size - 2) {
        // Skip duplicate fixed values
        if (i > 0 && nums[i] == nums[i - 1]) continue
        var left = i + 1
        var right = nums.lastIndex
        while (left < right) {
            val sum = nums[i] + nums[left] + nums[right]

            if (sum == 0) { // check triplet sum is 0
                result.add(
                    listOf(nums[i], nums[left], nums[right])
                )
                left++
                right--

                // Skip duplicate left values
                while (left < right && nums[left] == nums[left - 1]) {
                    left++
                }

                // Skip duplicate right values
                while (left < right && nums[right] == nums[right + 1]) {
                    right--
                }

            } else if (sum < 0) {
                left++
            } else {
                right--
            }
        }
    }
    return result
}