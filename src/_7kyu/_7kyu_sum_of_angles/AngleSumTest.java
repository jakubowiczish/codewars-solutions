package _7kyu._7kyu_sum_of_angles;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AngleSumTest {

    @Test
    public void sampleTests() {
        assertEquals(AngleSum.sumOfAngles(3), 180);
        assertEquals(AngleSum.sumOfAngles(4), 360);
    }
}