package com.vindroid.leetcode

fun main() {
    // Input: height = [1,8,6,2,5,4,8,3,7]
    // Output: 49
    val given = intArrayOf(1,8,6,2,5,4,8,3,7)
    val result = maxArea(given)
    println("Input : ${given.contentToString()}")
    println("Output : $result")

}

private fun maxArea(height: IntArray): Int {
    if (height.isEmpty()) return -1
    var left = 0
    var right = height.lastIndex
    var maxArea = 0
    while (left < right) {

        val width = right - left
        val minHeight = minOf(height[left], height[right])
        val area = width * minHeight
        maxArea = maxOf(maxArea, area)

        if (height[left] < height[right])
            left++
        else right--
    }
    return maxArea
}