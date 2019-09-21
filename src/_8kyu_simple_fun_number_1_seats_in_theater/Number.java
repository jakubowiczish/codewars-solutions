package _8kyu_simple_fun_number_1_seats_in_theater;

public class Number {
    static int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nCols - col + 1) * (nRows - row);
    }
}
