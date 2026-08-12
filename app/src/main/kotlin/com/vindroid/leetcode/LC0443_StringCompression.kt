package com.vindroid.leetcode

fun main() {
//    Input : [a, a, a, a, a, a, a, a, a, a, a, b, b, c, c, c]
//    Output [a, 1, 1, b, 2, c, 3]
//    Output result size : 7

    val given =
        charArrayOf('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'c', 'c', 'c')
    println("Input : ${given.contentToString()}")
    val result = compress(given)
    println("Output result size : $result")

}

private fun compress(chars: CharArray): Int {
    var read = 0
    var write = 0
    while (read < chars.size) {
        var current = chars[read]
        val start = read

        while (read < chars.size && chars[read] == current) read++
        val count = read - start
        chars[write] = current
        write++

        if (count > 1) {
            val digits = count.toString().toCharArray()
            for (digit in digits) {
                chars[write] = digit
                write++
            }
        }
    }
    println("Output ${chars.take(write)}")
    return write
}