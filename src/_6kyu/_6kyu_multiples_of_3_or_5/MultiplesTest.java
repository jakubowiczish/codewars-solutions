package _6kyu._6kyu_multiples_of_3_or_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplesTest {

    @Test
    public void test() {
        assertEquals(23, new Multiples().solution(10));
    }
}
