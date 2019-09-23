package _8kyu._8kyu_count_the_monkeys;

import java.util.stream.*;
/*
You take your son to the forest to see the monkeys.
You know that there are a certain number there (n),
but your son is too young to just appreciate the full number,
he has to start counting them from 1.

As a good parent, you will sit and count with him.
Given the number (n), populate an array with all numbers up to and including that number, but excluding zero.

For example:

monkeyCount(10) // --> new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
monkeyCount(1) // --> new int[]{1}
 */

class MonkeyCounter {

    static int[] monkeyCount(final int n) {
        return IntStream.rangeClosed(1, n).toArray();
    }

    static int[] monkeyCount2(final int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; ++i) {
            result[i] = i + 1;
        }

        return result;
    }
}
