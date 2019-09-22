/*
Task
Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ().

Consider an Example :
With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:
1 * (2 + 3) = 5
1 * 2 * 3 = 6
1 + 2 * 3 = 7
(1 + 2) * 3 = 9

So the maximum value that you can obtain is 9.

Notes

The numbers are always positive.

The numbers are in the range (1  ≤  a, b, c  ≤  10).

You can use the same operation more than once.

It's not necessary to place all the signs and brackets.

Repetition in numbers may occur .

You cannot swap the operands. For instance, in the given example you cannot get expression (1 + 3) * 2 = 8.

Input >> Output Examples:

expressionsMatter(1,2,3)  ==>  return 9
Explanation:
After placing signs and brackets, the Maximum value obtained from the expression (1+2) * 3 = 9.

expressionsMatter(1,1,1)  ==>  return 3
Explanation:
After placing signs, the Maximum value obtained from the expression is 1 + 1 + 1 = 3.

expressionsMatter(9,1,1)  ==>  return 18
Explanation:
After placing signs and brackets, the Maximum value obtained from the expression is 9 * (1+1) = 18.
 */

function expressionMatter(a, b, c) {
    return Math.max(a + b + c, a * (b + c), (a + b) * c, a * b * c);
}

describe("Small values", function() {
    Test.assertEquals(expressionMatter(2, 1, 2), 6);
    Test.assertEquals(expressionMatter(2, 1, 1), 4);
    Test.assertEquals(expressionMatter(1, 1, 1), 3);
    Test.assertEquals(expressionMatter(1, 2, 3), 9);
    Test.assertEquals(expressionMatter(1, 3, 1), 5);
    Test.assertEquals(expressionMatter(2, 2, 2), 8);
});

describe("Medium values", function() {
    Test.assertEquals(expressionMatter(5, 1, 3), 20);
    Test.assertEquals(expressionMatter(3, 5, 7), 105);
    Test.assertEquals(expressionMatter(5, 6, 1), 35);
    Test.assertEquals(expressionMatter(1, 6, 1), 8);
    Test.assertEquals(expressionMatter(2, 6, 1), 14);
    Test.assertEquals(expressionMatter(6, 7, 1), 48);
});

describe("Mixed values", function() {
    Test.assertEquals(expressionMatter(2, 10, 3), 60);
    Test.assertEquals(expressionMatter(1, 8, 3), 27);
    Test.assertEquals(expressionMatter(9, 7, 2), 126);
    Test.assertEquals(expressionMatter(1, 1, 10), 20);
    Test.assertEquals(expressionMatter(9, 1, 1), 18);
    Test.assertEquals(expressionMatter(10, 5, 6), 300);
    Test.assertEquals(expressionMatter(1, 10, 1), 12);
});