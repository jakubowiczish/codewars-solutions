package _6kyu._6kyu_circularly_sorted_array;

/*
An array is circularly sorted if the elements are sorted in ascending order,
but displaced, or rotated, by any number of steps.

Complete the function/method that determines if the given array of integers is circularly sorted.

Examples
These arrays are circularly sorted (true):

[2, 3, 4, 5, 0, 1]       -->  [0, 1] + [2, 3, 4, 5]
[4, 5, 6, 9, 1]          -->  [1] + [4, 5, 6, 9]
[10, 11, 6, 7, 9]        -->  [6, 7, 9] + [10, 11]
[1, 2, 3, 4, 5]          -->  [1, 2, 3, 4, 5]
[5, 7, 43, 987, -9, 0]   -->  [-9, 0] + [5, 7, 43, 987]
[1, 2, 3, 4, 1]          -->  [1] + [1, 2, 3, 4]
While these are not (false):

[4, 1, 2, 5]
[8, 7, 6, 5, 4, 3]
[6, 7, 4, 8]
[7, 6, 5, 4, 3, 2, 1]
 */

class CircularlySortedArray {

    boolean isCircleSorted(int[] a) {

        boolean isNotAscending = false;
        for (int i = 1; i < a.length; ++i) {
            if (a[i - 1] > a[i]) {
                if (isNotAscending) return false;
                isNotAscending = true;
            }
        }

        if (isNotAscending && a[a.length - 1] > a[0]) return false;
        return true;
    }
}
