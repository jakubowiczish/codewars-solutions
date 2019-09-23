package _8kyu._8kyu_even_or_odd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenOrOddTest {

    @Test
    void testEvenOrOdd() {
        assertEquals(EvenOrOdd.evenOrOdd(6), "Even");
        assertEquals(EvenOrOdd.evenOrOdd(7), "Odd");
    }
}
