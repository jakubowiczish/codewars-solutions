package _7kyu._7kyu_odd_or_even;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddOrEvenTest {

    @Test
    public void exampleTest() {
        assertEquals("odd", OddOrEven.oddOrEven(new int[]{2, 5, 34, 6}));
    }
}