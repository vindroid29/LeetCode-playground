package com.vindroid.leetcode

fun main() {
    val nums1 = intArrayOf(1,2,3)
    val nums2 = intArrayOf(2,4,6)
    val result = findDifference(nums1,nums2)
    println("Input : num1 :${nums1.contentToString()} num2: ${nums2.contentToString()}")
    println("Output : $result")
}

private fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val set1 = nums1.toHashSet()
    val set2 = nums2.toHashSet()
    val result1 = mutableListOf<Int>()
    val result2 = mutableListOf<Int>()

    for (num in nums1.toSet()){
        if(num !in set2){
            result1.add(num)
        }
    }
    for (num in nums2.toSet()){
        if(num !in set1){
            result2.add(num)
        }
    }
    return listOf(result1,result2)
}