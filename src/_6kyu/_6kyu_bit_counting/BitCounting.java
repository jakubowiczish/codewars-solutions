package _6kyu._6kyu_bit_counting;

/*
Write a function that takes an integer as input,
and returns the number of bits that are equal
to one in the binary representation of that number.
You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010,
so the function should return 5 in this case
 */

class BitCounting {

    static int countBits(int n) {
        int counter = 0;

        while (n != 0) {
            if (n % 2 == 1) ++counter;
            n /= 2;
        }

        return counter;
    }

    // better one

    static int countBits2(int n) {
        return Integer.bitCount(n);
    }
}
