package _7kyu._7kyu_square_every_digit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareDigitTest {

    @Test
    void test() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
        assertEquals(1444, new SquareDigit().squareDigits(1222));
    }

}
