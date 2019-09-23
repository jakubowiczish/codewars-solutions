package _7kyu._7kyu_unlucky_days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnluckyDaysTest {

    @Test
    void testSomething() {
        assertEquals(3, UnluckyDays.unluckyDays(2015));
        assertEquals(1, UnluckyDays.unluckyDays(1986));
    }
}
