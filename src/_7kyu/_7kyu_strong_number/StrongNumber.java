package _7kyu._7kyu_strong_number;

/*
Definition
Strong number is the number that the sum of the factorial of its digits is equal to number itself.

```
For example: 145, since
1! + 4! + 5! = 1 + 24 + 120 = 145
So, 145 is a Strong number.
```

Task
Given a number, Find if it is Strong or not.

Warm-up (Highly recommended)
Playing With Numbers Series
Notes

Number passed is always Positive.

Return the result as String

Input >> Output Examples

strong_num(1) ==> return "STRONG!!!!"

Explanation:
Since , the sum of its digits' factorial of (1) is equal to number itself (1), Then its a Strong .

strong_num(123) ==> return "Not Strong !!"

Explanation:
Since the sum of its digits' factorial of 1! + 2! + 3! = 9 is not equal to number itself (123), Then it's Not Strong .

strong_num(2)  ==>  return "STRONG!!!!"

Explanation:
Since the sum of its digits' factorial of 2! = 2 is equal to number itself (2), Then its a Strong .

strong_num(150) ==> return "Not Strong !!"

Explanation:
Since the sum of its digits' factorial of 1! + 5! + 0! = 122 is not equal to number itself (150), Then it's Not Strong .

Playing with Numbers Series
Playing With Lists/Arrays Series
For More Enjoyable Katas
ALL translations are welcomed
Enjoy Learning !!
Zizou
 */

public class StrongNumber {

    private static String STRONG = "STRONG!!!!";
    private static String NOT_STRONG = "Not Strong !!";

    public static String isStrongNumber(int num) {
        int sum = 0;
        int expected = num;
        while (num > 0) {
            sum += getFactorial(num % 10);
            num /= 10;
        }

        return sum == expected ? STRONG : NOT_STRONG;
    }

    private static int getFactorial(int num) {
        if (num == 0 || num == 1) return 1;

        int result = 1;
        for (int i = 2; i <= num; ++i) {
            result *= i;
        }

        return result;
    }
}
