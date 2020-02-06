package _8kyu._8kyu_array_plus_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArrayPlusArrayTest {

    @Test
    public void sampleTests() {
        assertEquals(21, ArrayPlusArray.arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        assertEquals(-21, ArrayPlusArray.arrayPlusArray(new int[]{-1, -2, -3}, new int[]{-4, -5, -6}));
        assertEquals(15, ArrayPlusArray.arrayPlusArray(new int[]{0, 0, 0}, new int[]{4, 5, 6}));
        assertEquals(2100, ArrayPlusArray.arrayPlusArray(new int[]{100, 200, 300}, new int[]{400, 500, 600}));
    }
}
