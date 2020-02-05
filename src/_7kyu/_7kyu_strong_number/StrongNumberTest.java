package _7kyu._7kyu_strong_number;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrongNumberTest {

    private static String STRONG = "STRONG!!!!";
    private static String NOT_STRONG = "Not Strong !!";

    @Test
    public void testSomething() {
        assertEquals(STRONG, StrongNumber.isStrongNumber(1));
        assertEquals(STRONG, StrongNumber.isStrongNumber(2));
        assertEquals(STRONG, StrongNumber.isStrongNumber(145));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(7));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(93));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(185));
    }
}