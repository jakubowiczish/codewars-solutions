/*
Array inversion indicates how far the array is from being sorted.

Inversions are pairs of elements in array, that are out of order.

Examples
Kata.CountInversions(new int[] { 1,2,3,4 }); // 0 inversions

Kata.CountInversions(new int[] { 1,3,2,4 }); // 1 inversion: 2 and 3

Kata.CountInversions(new int[] { 4,1,2,3 }); // 3 inversions: 4 and 1, 4 and 2, 4 and 3

Kata.CountInversions(new int[] { 4,3,2,1 }); // 6 inversions: 4 and 3, 4 and 2, 4 and 1, 3 and 2, 3 and 1, 2 and 1
Goal
The goal is to come up with a function that can calculate inversions for any arbitrary array
*/

public class Calculate
{
  public static int CountInversions(int[] array)
  {
    int counter = 0;
    for (int i = 0; i < array.Length - 1; ++i) {
      for (int j = i + 1; j < array.Length; ++j) {
        if (array[i] > array[j]) ++counter;
      }
    }

    return counter;
  }
}