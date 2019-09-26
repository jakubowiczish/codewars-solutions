package _8kyu._8kyu_convert_a_number_to_a_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertNumberToStringTest {

    @Test
    void tests() {
        assertEquals("67", ConvertNumberToString.numberToString(67));
        assertEquals("123", ConvertNumberToString.numberToString(123));
        assertEquals("999", ConvertNumberToString.numberToString(999));
    }

}
