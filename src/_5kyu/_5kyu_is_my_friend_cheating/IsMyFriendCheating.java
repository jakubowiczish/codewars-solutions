package _5kyu._5kyu_is_my_friend_cheating;

import java.util.LinkedList;
import java.util.List;

/*
A friend of mine takes a sequence of numbers from 1 to n (where n > 0).
Within that sequence, he chooses two numbers, a and b.
He says that the product of a and b should be equal
to the sum of all numbers in the sequence, excluding a and b.
Given a number n, could you tell me the numbers he excluded from the sequence?
The function takes the parameter:
n (n is always strictly greater than 0)
and returns an array or a string (depending on the language) of the form:

[(a, b), ...] or [[a, b], ...] or {{a, b}, ...} or or [{a, b}, ...]
with all (a, b) which are the possible removed numbers in the sequence 1 to n.

[(a, b), ...] or [[a, b], ...] or {{a, b}, ...} or ...will be sorted in increasing order of the "a".

It happens that there are several possible (a, b).
The function returns an empty array (or an empty string)
if no possible numbers are found which will
prove that my friend has not told the truth! (Go: in this case return nil).

(See examples of returns for each language in "RUN SAMPLE TESTS")

Examples:
removNb(26) should return [(15, 21), (21, 15)]
or

removNb(26) should return { {15, 21}, {21, 15} }
or

removeNb(26) should return [[15, 21], [21, 15]]
or

removNb(26) should return [ {15, 21}, {21, 15} ]
or

removNb(26) should return "15 21, 21 15"
or

in C:
removNb(26) should return  **an array of pairs {{15, 21}{21, 15}}**
tested by way of strings.
 */

class IsMyFriendCheating {

    static List<long[]> removNb(long n) {
        long sum = (1 + n) * n / 2;
        LinkedList<long[]> result = new LinkedList<>();

        long minimum = (n * (n - 1) / 2) / (n + 1);
        long maximum = (long) (Math.sqrt(sum + 1) - 1);

        for (long i = maximum; i >= minimum; --i) {
            long j = (sum - i) / (i + 1);
            if (i * j == sum - i - j) {
                result.addFirst(new long[]{i, j});
                result.addLast(new long[]{j, i});
            }
        }

        return result;
    }

    /*
    Explanation:
    - Sum of numbers from 1 to n (Arithmetic progression):
        sum(n) = (1 + n) * n / 2
    - For this task to succeed in given amount of time, we have to notice that:
        - for every pair (i, j) where: i * j = sum - i - j
                                      (i * j + i + j) = sum
            i >= sum(n - 1) / (n + 1)
            and
            i < sqrt(sum(n) + 1) - 1

            therefore:
            i * j + j = sum(n) - i
            j * (i + 1) = sum(n) - i
            j = (sum(n) - i) / (i + 1)

            (Had to add solutions to list using addFirst for first result
                and addLast for second result in loop)
     */
}
