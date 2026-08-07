package com.vindroid.leetcode

fun main() {
// Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    val given = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    println("Input : ${given.contentToString()}")
    val result = removeDuplicates(given)
    println("Output array size : $result")
}

private fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var write = 0
    for (i in 1 until nums.size) {
        val current = nums[i]

        if (nums[write] != current) {
            ++write
            nums[write] = current
        }
    }
    val resultIndex = write.plus(1)
    println("Output : ${nums.take(resultIndex)}")
    return resultIndex
}