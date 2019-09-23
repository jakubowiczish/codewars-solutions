package _7kyu._7kyu_unlucky_days;

import java.time.DayOfWeek;
import java.time.LocalDate;

/*
Friday 13th or Black Friday is considered as unlucky day.

Calculate how many unlucky days are in the given year.

Find the number of Friday 13th in the given year.

Input: Year as an integer.

Output: Number of Black Fridays in the year as an integer.

Examples:

unluckyDays(2015) == 3
unluckyDays(1986) == 1
Note: In Ruby years will start from 1593.
 */

class UnluckyDays {

    static int unluckyDays(int year) {
        LocalDate first = LocalDate.of(year, 1, 1);
        LocalDate last = LocalDate.of(year, 12, 31);

        int counter = 0;
        for (LocalDate date = first; date.isBefore(last); date = date.plusDays(1)) {
            if (DayOfWeek.FRIDAY.equals(date.getDayOfWeek())
                    && date.getDayOfMonth() == 13) {
                ++counter;
            }
        }

        return counter;
    }
}
