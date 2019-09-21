package _7kyu_sum_of_odd_numbers;

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
