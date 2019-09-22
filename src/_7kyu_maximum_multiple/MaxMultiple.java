package _7kyu_maximum_multiple;
/*
Task

Given a Divisor and a Bound , Find the largest integer N , Such That ,

Conditions :
N is divisible by divisor

N is less than or equal to bound

N is greater than 0.
Notes
The parameters (divisor, bound) passed to the function are only positve values .
It's guaranteed that a divisor is Found .
Input >> Output Examples

maxMultiple (2,7) ==> return (6)

Explanation:
(6) is divisible by (2) , (6) is less than or equal to bound (7) , and (6) is > 0 .

maxMultiple (10,50)  ==> return (50)

Explanation:
(50) is divisible by (10) , (50) is less than or equal to bound (50) , and (50) is > 0 .*


maxMultiple (37,200) ==> return (185)

Explanation:
(185) is divisible by (37) , (185) is less than or equal to bound (200) , and (185) is > 0 .
 */

class MaxMultiple {

    static int maxMultiple(int divisor, int bound) {
        for (int i = bound; i > 0; --i) {
            if (i % divisor == 0) return i;
        }

        return 1;
    }

    // better solution

    static int maxMultiple2(int divisor, int bound) {
        return bound - (bound % divisor);
    }

}

