package _8kyu._8kyu_get_nth_even_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumTest {

    @Test
    void exampleTests() {
        assertEquals(0, Num.nthEven(1));
        assertEquals(2, Num.nthEven(2));
        assertEquals(4, Num.nthEven(3));
        assertEquals(198, Num.nthEven(100));
        assertEquals(2597466, Num.nthEven(1298734));
    }
}