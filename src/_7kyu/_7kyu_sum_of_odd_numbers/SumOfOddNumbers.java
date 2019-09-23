package _7kyu._7kyu_sum_of_odd_numbers;

/*
Given the triangle of consecutive odd numbers:
```
             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
```

Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:

rowSumOddNumbers(1); // 1
rowSumOddNumbers(2); // 3 + 5 = 8
 */

class SumOfOddNumbers {

    static int rowSumOddNumbers(int n) {
        int firstInNthRow = n * n - (n - 1);
        int lastInNthRow = firstInNthRow + (n - 1) * 2;
        return (firstInNthRow + lastInNthRow) * n / 2;
    }

    // after simplification I noticed that it's same as

    static int rowSumOddNumbers2(int n) {
        return n * n * n;
    }
}
