package _8kyu._8kyu_a_needle_in_the_haystack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NeedleExampleTests {

    @Test
    void tests() {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        Object[] haystack3 = {1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 5, 4, 3, 4, 5, 6, 67, 5, 5, 3, 3, 4, 2, 34, 234, 23, 4, 234, 324, 324, "needle", 1, 2, 3, 4, 5, 5, 6, 5, 4, 32, 3, 45, 54};
        assertEquals("found the needle at position 3", NeedleInTheHaystack.findNeedle(haystack1));
        assertEquals("found the needle at position 5", NeedleInTheHaystack.findNeedle(haystack2));
        assertEquals("found the needle at position 30", NeedleInTheHaystack.findNeedle(haystack3));
    }
}
