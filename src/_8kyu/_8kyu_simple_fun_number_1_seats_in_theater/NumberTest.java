package _8kyu._8kyu_simple_fun_number_1_seats_in_theater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberTest {

    @Test
    void exampleTests() {
        assertEquals(96, Number.seatsInTheater(16, 11, 5, 3));
        assertEquals(0, Number.seatsInTheater(1, 1, 1, 1));
        assertEquals(18, Number.seatsInTheater(13, 6, 8, 3));
        assertEquals(99, Number.seatsInTheater(60, 100, 60, 1));
        assertEquals(0, Number.seatsInTheater(1000, 1000, 1000, 1000));
    }
}