package _6kyu._6kyu_circularly_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularlySortedArrayTest {

    @Test
    void testTrue() {
        CircularlySortedArray circularlySortedArray = new CircularlySortedArray();

        int[] A = {3, 0, 1, 2};
        assertTrue(circularlySortedArray.isCircleSorted(A));
    }

    @Test
    void testFalse() {
        CircularlySortedArray circularlySortedArray = new CircularlySortedArray();

        int[] A = {9, 10, 14, 12};
        assertFalse(circularlySortedArray.isCircleSorted(A));
    }
}
