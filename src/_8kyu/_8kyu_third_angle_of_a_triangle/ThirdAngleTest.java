package _8kyu._8kyu_third_angle_of_a_triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThirdAngleTest {

    @Test
    void testOtherAngle() {
        assertEquals(123, ThirdAngle.otherAngle(45,12));
        assertEquals(70, ThirdAngle.otherAngle(50,60));
    }
}