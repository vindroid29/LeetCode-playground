package com.vindroid.leetcode

fun main() {
    val priceList = intArrayOf(7, 1, 5, 3, 6, 4)
    bestTimeToBuySellStock(priceList)
}

private fun bestTimeToBuySellStock(prices: IntArray): Triple<Int, Int, Int> {

    var minPrice = Int.MAX_VALUE
    var sellPrice = Int.MIN_VALUE
    var minPriceIndex = -1

    var buyIndex = -1
    var sellIndex = -1
    var maxProfit = 0

    for ((index, price) in prices.withIndex()) {

        if (price < minPrice) {
            minPrice = price
            minPriceIndex = index
        }

        val profit = price - minPrice

        if (profit > maxProfit) {
            maxProfit = profit
            buyIndex = minPriceIndex
            sellIndex = index
            sellPrice = price
        }
    }


    println("min price to buy : $minPrice buyIndex $buyIndex")
    println("max sellPrice : $sellPrice sellIndex $sellIndex")
    println("maxProfit : $maxProfit")

    return Triple(buyIndex, sellIndex, maxProfit)
}