package _6kyu._6kyu_camelcase_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CamelCaseMethodTest {

    @Test
    void testTwoWords() {
        assertEquals("TestCase", CamelCaseMethod.camelCase("test case"));
    }

    @Test
    void testThreeWords() {
        assertEquals("CamelCaseMethod", CamelCaseMethod.camelCase("camel case method"));
    }

    @Test
    void testLeadingSpace() {
        assertEquals("CamelCaseWord", CamelCaseMethod.camelCase(" camel case word"));
    }

    @Test
    void testTrailingSpace() {
        assertEquals("SayHello", CamelCaseMethod.camelCase("say hello "));
    }

    @Test
    void testSingleLetter() {
        assertEquals("Z", CamelCaseMethod.camelCase("z"));
    }

    @Test
    void testTwoSpacesBetweenWords() {
        assertEquals("AbC", CamelCaseMethod.camelCase("ab  c"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", CamelCaseMethod.camelCase(""));
    }
}
