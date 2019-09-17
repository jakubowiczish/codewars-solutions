public class ExesAndOhs {

    public static boolean getXO(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == 'X' || str.charAt(i) == 'x') ++counter;
            if (str.charAt(i) == 'O' || str.charAt(i) == 'o') --counter;
        }

        return counter == 0;
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ExesAndOhsTest {

    @Test
    public void testSomething1() {
        assertEquals(true, XO.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertEquals(true, XO.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertEquals(false, XO.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertEquals(false, XO.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertEquals(false, XO.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertEquals(true, XO.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertEquals(false, XO.getXO("Xxxxertr34"));
    }
}