package _7kyu._7kyu_sum_of_odd_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SumOfOddNumbersTest {

    @Test
    void test1() {
        assertEquals(1, SumOfOddNumbers.rowSumOddNumbers(1));
        assertEquals(74088, SumOfOddNumbers.rowSumOddNumbers(42));
    }
}

