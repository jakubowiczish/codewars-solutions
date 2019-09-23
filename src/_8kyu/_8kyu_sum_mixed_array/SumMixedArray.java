package _8kyu._8kyu_sum_mixed_array;

import java.util.List;

/*
Given an array of integers as strings and numbers,
return the sum of the array values as if all were numbers.

Return your answer as a number.
 */

class SumMixedArray {

    /*
     * Assume input will be only of Integer o String type
     */
    int sum(List<?> mixed) {
        return mixed.stream()
                .mapToInt(e -> Integer.parseInt(e.toString()))
                .sum();
    }
}
