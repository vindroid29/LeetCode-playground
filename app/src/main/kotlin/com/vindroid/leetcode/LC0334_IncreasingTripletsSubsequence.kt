package com.vindroid.leetcode

fun main() {
    //nums = [1,2,3,4,5] Output: true
    //nums = [5,4,3,2,1] Output: false
    val given = intArrayOf(1,2,3,4,5)
    val result = increasingTriplet(given)
    println("Input : ${given.contentToString()}")
    println("Output : $result")


}
private fun increasingTriplet(nums: IntArray): Boolean {
    var first = Int.MAX_VALUE
    var second = Int.MAX_VALUE
    for (num in nums){
        when{
            num <= first -> first = num
            num <= second -> second = num
            else -> return true
        }
    }
    return false
}