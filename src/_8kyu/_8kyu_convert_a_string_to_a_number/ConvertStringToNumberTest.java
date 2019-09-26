package _8kyu._8kyu_convert_a_string_to_a_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertStringToNumberTest {

    @Test
    void test1() {
        assertEquals(1234, ConvertStringToNumber.stringToNumber("1234"));
    }

    @Test
    void test2() {
        assertEquals(605, ConvertStringToNumber.stringToNumber("605"));
    }

    @Test
    void test3() {
        assertEquals(1405, ConvertStringToNumber.stringToNumber("1405"));
    }

    @Test
    void test4() {
        assertEquals(-7, ConvertStringToNumber.stringToNumber("-7"));
    }
}
