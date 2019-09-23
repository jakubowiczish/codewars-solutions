package _7kyu._7kyu_exes_and_ohs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExesAndOhsTest {

    @Test
    void testSomething1() {
        assertTrue(ExesAndOhs.getXO("xxxooo"));
    }

    @Test
    void testSomething2() {
        assertTrue(ExesAndOhs.getXO("xxxXooOo"));
    }

    @Test
    void testSomething3() {
        assertFalse(ExesAndOhs.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    void testSomething4() {
        assertFalse(ExesAndOhs.getXO("xXxxoewrcoOoo"));
    }

    @Test
    void testSomething5() {
        assertFalse(ExesAndOhs.getXO("XxxxooO"));
    }

    @Test
    void testSomething6() {
        assertTrue(ExesAndOhs.getXO("zssddd"));
    }

    @Test
    void testSomething7() {
        assertFalse(ExesAndOhs.getXO("Xxxxertr34"));
    }
}
