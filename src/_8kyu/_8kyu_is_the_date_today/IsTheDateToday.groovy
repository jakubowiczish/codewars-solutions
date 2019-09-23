package _8kyu._8kyu_is_the_date_today

class IsTheDateToday {

    static Boolean isToday(date) {
        return new Date().format('yyyyMMdd').equals(date.format('yyyyMMdd'))
    }
}