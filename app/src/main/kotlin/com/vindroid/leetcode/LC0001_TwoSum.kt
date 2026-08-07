package com.vindroid.leetcode


fun main() {

    val given = intArrayOf(1, 2, 7, 11, 15)
    val target = 9

    val result = twoSum(given, target)

    println("Input ${given.contentToString()} target : $target")
    println("Output ${result.contentToString()}")

}

private fun twoSum(numbers: IntArray, targetValue: Int): IntArray {
    val numberToIndex = mutableMapOf<Int?, Int?>()

    for ((index,num) in numbers.withIndex()) {  // 1,2,7
        val complement = targetValue - num    // 8,7,2

        val previousIndex = numberToIndex[complement]
        if (previousIndex != null) {
            return intArrayOf(previousIndex, index)     // [1,2] (i.e. 2,7 = 9)
        }

        numberToIndex[num] = index    // [1,0],[2,1],
    }
    return intArrayOf()
}