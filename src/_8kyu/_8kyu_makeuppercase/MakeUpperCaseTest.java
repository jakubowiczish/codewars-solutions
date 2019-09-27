package _8kyu._8kyu_makeuppercase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MakeUpperCaseTest {

    @Test
    void testSomething() {
        assertEquals("HELLO", MakeUpperCase.makeUpperCase("hello"));
    }
}
