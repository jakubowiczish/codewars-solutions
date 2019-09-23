package _7kyu._7kyu_string_ends_with;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringEndsWithTest {

    @Test
    void testSomething() {
        assertTrue(StringEndsWith.solution("abc", "bc"));
        assertFalse(StringEndsWith.solution("abc", "d"));
    }

}
