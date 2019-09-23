package _8kyu._8kyu_century_from_year;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CenturyFromYearTest {

    @Test
    void FixedTests() {
        assertEquals(18, CenturyFromYear.century(1705));
        assertEquals(19, CenturyFromYear.century(1900));
        assertEquals(17, CenturyFromYear.century(1601));
        assertEquals(20, CenturyFromYear.century(2000));
        assertEquals(1, CenturyFromYear.century(89));
    }
}
