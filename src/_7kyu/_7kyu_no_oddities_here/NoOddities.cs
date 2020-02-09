using System.Linq;

/*
Write a small function that returns the values of an array that are not odd.

All values in the array will be integers. Return the good values in the order they are given.

NoOdds(int[] values)
*/

public class NoOddities
{
    public static int[] NoOdds(int[] values) =>
      values.Where(e => e % 2 == 0).ToArray();
}