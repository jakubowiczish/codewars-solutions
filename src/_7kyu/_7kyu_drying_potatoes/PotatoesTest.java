package _7kyu._7kyu_drying_potatoes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PotatoesTest {

    private static void doTest(int p0, int w0, int p1, int expected) {
        assertEquals(expected, Potatoes.potatoes(p0, w0, p1));
    }

    @Test
    void test() {
        doTest(82, 127, 80, 114);
        doTest(93, 129, 91, 100);
    }
}
