public class EvenOrOdd {
    public static String evenOrOdd(int number) {
        return (number & 1) == 0 ? "Even" : "Odd";
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class EvenOrOddTest {

    @Test
    public void testEvenOrOdd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals(eoo.evenOrOdd(6), "Even");
        assertEquals(eoo.evenOrOdd(7), "Odd");
    }
}