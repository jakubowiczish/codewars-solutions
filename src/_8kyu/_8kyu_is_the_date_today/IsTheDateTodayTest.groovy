package _8kyu._8kyu_is_the_date_today

import org.junit.jupiter.api.Test

class IsTheDateTodayTest {

    @Test
    void "Fixed Tests" () {
        Date yesterday = new Date() - 1
        Date tomorrow = new Date() + 1
        assert IsTheDateToday.isToday(new Date())
        assert !IsTheDateToday.isToday(tomorrow)
        assert !IsTheDateToday.isToday(yesterday)
    }
}