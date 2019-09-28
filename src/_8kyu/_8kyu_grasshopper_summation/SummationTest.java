package _8kyu._8kyu_grasshopper_summation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SummationTest {

    @Test
    void test1() {
        assertEquals(1, Summation.summation(1));
    }

    @Test
    void test2() {
        assertEquals(36, Summation.summation(8));
    }
}
