package _8kyu._8kyu_convert_number_to_reversed_array_of_digits;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DigitizeTest {

    @Test
    public void tests() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, Digitize.digitize(35231));
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, Digitize.digitize2(35231));
    }
}
