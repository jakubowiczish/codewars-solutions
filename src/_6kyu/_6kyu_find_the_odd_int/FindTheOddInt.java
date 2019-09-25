package _6kyu._6kyu_find_the_odd_int;

/*
Given an array, find the int that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
 */

import java.util.HashMap;
import java.util.Map;

class FindTheOddInt {

    // my first, naive solution:

    static int findIt(int[] a) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int value : a) {
            int counter = occurrences.getOrDefault(value, 0);
            occurrences.put(value, counter + 1);
        }

        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() % 2 == 1) return entry.getKey();
        }

        throw new IllegalArgumentException("Incorrect array");
    }

    // smart solution

    public static int findIt2(int[] a) {
        int xor = 0;

        for (int value : a) {
            xor ^= value;
        }

        return xor;
    }
}
