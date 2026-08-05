package com.vindroid.leetcode

fun main(){
    val nums = intArrayOf(1,12,-5,-6,50,3)
    val k = 4
    val result = findMaxAverage(nums,k)
    println("Max average is :$result")
}
private fun findMaxAverage(nums: IntArray, k: Int): Double {
    var currentSum = 0
    for (i in 0 until k){
        currentSum +=nums[i]
    }
    var maxSum = currentSum
    for(i in k until nums.size){
        currentSum = currentSum - nums[i-k] + nums[i]
        maxSum = maxOf(maxSum,currentSum)
    }
    return (maxSum.toDouble()/k)
}