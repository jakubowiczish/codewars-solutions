package _6kyu._6kyu_detect_pangram;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PangramCheckerTest {

    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramChecker pc = new PangramChecker();
        assertTrue(pc.check(pangram1));
    }

    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        PangramChecker pc = new PangramChecker();
        assertFalse(pc.check(pangram2));
    }
}