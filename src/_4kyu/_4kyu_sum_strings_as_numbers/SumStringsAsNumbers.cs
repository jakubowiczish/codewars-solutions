using System;
using System.Numerics;

/*
Given the string representations of two integers,
return the string representation of the sum of those integers.

For example:

sumStrings('1','2') // => '3'

A string representation of an integer will contain
no characters besides the ten numerals "0" to "9".
*/

public static class SumStringsAsNumbers
{
    public static string sumStrings(string a, string b)
    {
      BigInteger numberA;
      BigInteger numberB;

      BigInteger.TryParse(a, out numberA);
      BigInteger.TryParse(b, out numberB);

      return (numberA + numberB).ToString();
    }
}