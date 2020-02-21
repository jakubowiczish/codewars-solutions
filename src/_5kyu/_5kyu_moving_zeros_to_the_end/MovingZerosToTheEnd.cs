using System.Linq;

/*
Write an algorithm that takes an array
and moves all of the zeros to the end,
preserving the order of the other elements.

Kata.MoveZeroes(new int[] {1, 2, 0, 1, 0, 1, 0, 3, 0, 1}) => new int[] {1, 2, 1, 1, 3, 1, 0, 0, 0, 0}
*/

public class Kata
{
  public static int[] MoveZeroes(int[] arr)
  {
    return arr.OrderBy(x => x == 0).ToArray();
  }

  public static int[] MoveZeroes2(int[] arr)
    {
      int nonZeroCounter = 0;

      for (int i = 0; i < arr.Length; ++i) {
        if (arr[i] != 0) {
          arr[nonZeroCounter++] = arr[i];
        }
      }

      while (nonZeroCounter < arr.Length)
        arr[nonZeroCounter++] = 0;

      return arr;
    }
}