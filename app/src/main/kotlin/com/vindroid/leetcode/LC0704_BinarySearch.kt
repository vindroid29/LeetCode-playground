package com.vindroid.leetcode

fun main() {
    val nums = intArrayOf(1, 3, 5, 7, 9, 11)
    val target = 2
    val result = binarySearch(nums, target)

    if (result != -1) {
        println("Target $target found at index: $result")
    } else {
        println("Target $target not found in the array.")
    }
}

private fun binarySearch(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.lastIndex

    while (left <= right) {
        val mid = left + (right - left) / 2
        if (nums[mid] == target) {
            return mid
        } else if (nums[mid] < target) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    return  -1
}