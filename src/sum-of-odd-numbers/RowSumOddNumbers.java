class RowSumOddNumbers {

    public static int rowSumOddNumbers(int n) {
        int firstInNthRow = n * n - (n - 1);
        int lastInNthRow = firstInNthRow + (n - 1) * 2;
        return (firstInNthRow + lastInNthRow) * n / 2;
    }

    // after simplification I noticed that it's same as

    public static int rowSumOddNumbers(int n) {
        return n * n * n;
    }

}

import static org.junit.Assert.*;
import org.junit.Test;

public class RowSumOddNumbersTest {

    @Test
    public void test1() {
        assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
        assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));
    }
}