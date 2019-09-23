package _8kyu._8kyu_square_n_sum;

import java.util.Arrays;

/*
Complete the square sum function so that it squares
each number passed into it and then sums the results together.

For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
 */

class SquareNSum {

    static int squareSum(int[] n) {
        return Arrays.stream(n)
                .map(e -> e * e)
                .sum();
    }
}
