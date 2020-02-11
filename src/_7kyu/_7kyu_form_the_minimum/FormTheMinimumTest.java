package _7kyu._7kyu_form_the_minimum;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormTheMinimumTest {

    @Test
    public void testSomething() {
        assertEquals(13, FormTheMinimum.minValue(new int[]{1, 3, 1}));
        assertEquals(457, FormTheMinimum.minValue(new int[]{4, 7, 5, 7}));
        assertEquals(148, FormTheMinimum.minValue(new int[]{4, 8, 1, 4}));
        assertEquals(579, FormTheMinimum.minValue(new int[]{5, 7, 9, 5, 7}));
        assertEquals(678, FormTheMinimum.minValue(new int[]{6, 7, 8, 7, 6, 6}));
    }
}
