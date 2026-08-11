package com.vindroid.leetcode

fun main() {
//    Input: candies = [2,3,5,1,3], extraCandies = 3
//    Output: [true,true,true,false,true]
    val input = intArrayOf(2, 3, 5, 1, 3)
    val extraCandies = 3
    val result = getKidsWithMaxCandies(input, extraCandies)
    println("Input : ${input.contentToString()}")
    println("Output : $result")

}

private fun getKidsWithMaxCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    if (candies.isEmpty()) return listOf()
    var maxCandies = candies[0]

    for (num in candies) {
        maxCandies = maxOf(maxCandies, num)
    }
    val result = MutableList(candies.size){ i ->
        candies[i] + extraCandies >= maxCandies
    }
    return result
}