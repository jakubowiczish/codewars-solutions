package _8kyu._8kyu_counting_sheep_dot_dot_dot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class CounterTest {
    private Boolean[] array1 = {true, true, true, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            true, true, true, true,
            false, false, true, true};

    @Test
    void test() {
        assertEquals("There are 17 sheeps in total", 17, new Counter().countSheeps(array1));
    }
}
