/*
##1 - Factorial

In mathematics, the factorial of a non-negative integer n, denoted by n!,
is the product of all positive integers less than or equal to n. For example,

5! = 5 * 4 * 3 * 2 * 1 = 120.

The value of 0! is 1.

#Your task

You have to create the function factorial that receives n and returns n!. You have to use recursion.
*/

public class Recursion {

	public static ulong Factorial(ulong n) {
		checked {
			if (n == 0) return 1;
			return n * Factorial(n - 1);
		}
	}
}