import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringEndsWith {

    public static boolean solution(String str, String ending) {
        return str != null && str.endsWith(ending);
    }
}


class StringEndsWithTest {

    @Test
    public void testSomething() {
        assertEquals(true, StringEndsWith.solution("abc", "bc"));
        assertEquals(false, StringEndsWith.solution("abc", "d"));
    }
}