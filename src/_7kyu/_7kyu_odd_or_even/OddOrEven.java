package _7kyu._7kyu_odd_or_even;

import java.util.Arrays;

/*
Task:
Given a vector of numbers, determine whether the sum of all of the numbers is odd or even.

Give your answer as a String matching "odd" or "even".

If the input array is empty consider it as: [0] (array with a zero).

Example:
odd_or_even([0]) returns "even"
odd_or_even([0, 1, 4]) returns "odd"
odd_or_even([0, -1, -5]) returns "even"
Have fun!
 */

public class OddOrEven {
    public static String oddOrEven(int[] array) {
        return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}