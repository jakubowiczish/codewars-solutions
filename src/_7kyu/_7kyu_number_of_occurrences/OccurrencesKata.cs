using System;

public class OccurrencesKata
{
    public static int NumberOfOccurrences(int x, int[] xs)
    {
        int counter = 0;
  	    for (int i = 0; i < xs.Length; ++i) {
            if (xs[i] == x) ++counter;
        }

        return counter;
  }
}