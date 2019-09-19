package spacify;

public class Spacify {
    public static String spacify(String str) {
        return str.replace("", " ").trim();
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

public class SpacifyTest {

    @Test
    public void basicTest() {
        assertEquals("h e l l o   w o r l d", Spacify.spacify("hello world"));
        assertEquals("1 2 3 4 5", Spacify.spacify("12345"));
    }
}
