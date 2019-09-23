package _8kyu._8kyu_square_n_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareNSumTest {

    @Test
    void testBasic() {
        assertEquals(9, SquareNSum.squareSum(new int[]{1, 2, 2}));
        assertEquals(5, SquareNSum.squareSum(new int[]{1, 2}));
        assertEquals(50, SquareNSum.squareSum(new int[]{5, -3, 4}));
    }
}
