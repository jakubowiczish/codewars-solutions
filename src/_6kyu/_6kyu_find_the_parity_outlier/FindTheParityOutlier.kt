package _6kyu._6kyu_find_the_parity_outlier

/*
You are given an array (which will have a length of at least 3, but could be very large) containing integers.
The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.

Write a method that takes the array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)
 */

fun find(integers: Array<Int>): Int {
    return integers.singleOrNull { it % 2 == 0 } ?: integers.single { it % 2 != 0 }
}

fun find2(integers: Array<Int>): Int {
    val evenOnes = integers.filter { it % 2 == 0 }
    val oddOnes = integers.filter { it % 2 != 0 }
    return if (evenOnes.size == 1) {
        evenOnes.first()
    } else {
        oddOnes.first()
    }
}

fun find3(integers: Array<Int>): Int {
    var lookForEven = false

    for (x in 0 until 2) {
        lookForEven = if (integers[0] % 2 == 0 && integers[1] % 2 == 0)
            false
        else if (integers[0] % 2 != 0 && integers[1] % 2 != 0)
            true
        else {
            integers[2] % 2 != 0
        }
    }

    if (lookForEven) {
        for (x in integers) {
            if (x % 2 == 0) return x
        }
    } else {
        for (x in integers)
            if (x % 2 != 0) return x
    }

    return 0
}