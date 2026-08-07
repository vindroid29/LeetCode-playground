package com.vindroid.leetcode


fun main() {
//    Input: flowerbed = [1,0,0,0,1], n = 1
//    Output: true
//    Input: flowerbed = [1,0,0,0,1], n = 2
//    Output: false
    val given = intArrayOf(1, 0, 0, 0, 1)
    for (i in 1..2) {
        println("input : ${given.contentToString()}, n = $i")
        val result = canPlaceFlower(given.copyOf(), i)
        println("output : $result")
    }

}

private fun canPlaceFlower(flowerbed: IntArray, n: Int): Boolean {
    if (n == 0) return true
    var count = 0
    for (i in flowerbed.indices) {
        if ((flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0))
            && (i == flowerbed.lastIndex || flowerbed[i + 1] == 0)
        ) {
            flowerbed[i] = 1
            count++
            if (count >= n) return true
        }
    }
    return count >= n
}