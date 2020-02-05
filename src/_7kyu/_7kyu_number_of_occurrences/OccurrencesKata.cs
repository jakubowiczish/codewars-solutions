using System;
using System.Linq;

public class OccurrencesKata
{
    public static int NumberOfOccurrences(int x, int[] xs)
    {
  	    return xs.Count(el => el == x);
    }

    public static int NumberOfOccurrences2(int x, int[] xs)
    {
        int counter = 0;
  	    for (int i = 0; i < xs.Length; ++i) {
            if (xs[i] == x) ++counter;
        }

        return counter;
  }
}