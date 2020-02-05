package _8kyu._8kyu_convert_number_to_reversed_array_of_digits;

/*
Convert number to reversed array of digits
Given a random number:

C#: long;
C++: unsigned long;
You have to return the digits of this number within an array in reverse order.

Example:
348597 => [7,9,5,8,4,3]
 */

public class Digitize {

    public static int[] digitize(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    public static int[] digitize2(long n) {
        System.out.println(n);
        int size = getNumberOfDigits(n);
        int[] result = new int[size];
        for (int i = 0; i < size; ++i) {
            result[i] = (int)(n % 10);
            n /= 10;
        }

        return result;
    }

    private static int getNumberOfDigits(long n) {
        int counter = 0;
        while (n > 0) {
            ++counter;
            n /= 10;
        }

        return counter;
    }
}
