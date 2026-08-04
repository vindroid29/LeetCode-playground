package com.vindroid.leetcode

fun main() {
// Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    val given = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val result = removeDuplicates(given)
    println("result : $result")
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
    return write.plus(1)
}