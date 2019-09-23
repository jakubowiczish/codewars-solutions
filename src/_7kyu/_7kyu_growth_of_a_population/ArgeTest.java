package _7kyu._7kyu_growth_of_a_population;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArgeTest {

    @Test
    void test() {
        System.out.println("Fixed Tests: nbYear");
        assertEquals(Arge.nbYear(1500, 5, 100, 5000), 15);
        assertEquals(Arge.nbYear(1500000, 2.5, 10000, 2000000), 10);
        assertEquals(Arge.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}