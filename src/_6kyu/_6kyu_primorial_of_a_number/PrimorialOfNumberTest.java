package _6kyu._6kyu_primorial_of_a_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimorialOfNumberTest {

    @Test
    void checkSmallValues() {
        assertEquals("30", PrimorialOfNumber.numPrimorial(3));
        assertEquals("210", PrimorialOfNumber.numPrimorial(4));
        assertEquals("2310", PrimorialOfNumber.numPrimorial(5));
    }

    @Test
    void checkLargerValues() {
        assertEquals("9699690", PrimorialOfNumber.numPrimorial(8));
        assertEquals("223092870", PrimorialOfNumber.numPrimorial(9));
    }
}
