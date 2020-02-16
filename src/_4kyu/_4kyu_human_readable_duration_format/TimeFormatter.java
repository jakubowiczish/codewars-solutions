package _4kyu._4kyu_human_readable_duration_format;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

/*
Your task in order to complete this Kata is to write
a function which formats a duration,
given as a number of seconds, in a human-friendly way.

The function must accept a non-negative integer.

If it is zero, it just returns "now".

Otherwise, the duration is expressed as a combination of years,
days, hours, minutes and seconds.

It is much easier to understand with an example:

TimeFormatter.formatDuration(62)   //returns "1 minute and 2 seconds"
TimeFormatter.formatDuration(3662) //returns "1 hour, 1 minute and 2 seconds"

For the purpose of this Kata,
a year is 365 days and a day is 24 hours.

Note that spaces are important.

Detailed rules

The resulting expression is made of components like 4 seconds,
1 year, etc. In general, a positive integer and one of the
valid units of time, separated by a space.

The unit of time is used in plural if the integer is greater than 1.

The components are separated by a comma and a space (", ").

Except the last component, which is separated by " and ", just like it would be written in English.

A more significant units of time will occur before than a
least significant one.

Therefore, 1 second and 1 year is not correct,
but 1 year and 1 second is.

Different components have different unit of times.

So there is not repeated units like in 5 seconds and 1 second.

A component will not appear at all if its value happens to be zero.

Hence, 1 minute and 0 seconds is not valid,
but it should be just 1 minute.

A unit of time must be used "as much as possible".

It means that the function should not return 61 seconds,
but 1 minute and 1 second instead.

Formally, the duration specified by of a component
must not be greater than any valid more significant unit of time.
 */

public class TimeFormatter {

    // TODO refactor

    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";
        int years = seconds / 31556952;
        int days = (seconds / 86400) % 365;
        int hours = (seconds / 3600) % 24;
        int minutes = (seconds / 60) % 60;
        int sec = seconds % 60;

        return formatWholeDate(Arrays.asList(
                formatTime(years, "year"),
                formatTime(days, "day"),
                formatTime(hours, "hour"),
                formatTime(minutes, "minute"),
                formatTime(sec, "second")
        ));
    }

    private static String formatWholeDate(List<String> times) {
        List<String> fTimes = times.stream().filter(Objects::nonNull).collect(toList());

        if (fTimes.size() == 1)
            return fTimes.get(0);
        if (fTimes.size() == 2)
            return fTimes.get(0) + " and " + fTimes.get(1);
        if (fTimes.size() >= 3) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < fTimes.size() - 2; i++) {
                sb.append(fTimes.get(i)).append(", ");
            }
            sb.append(fTimes.get(fTimes.size() - 2)).append(" and ").append(fTimes.get(fTimes.size() - 1));
            return sb.toString();
        }
        return "";
    }

    private static String formatTime(int time, String unit) {
        if (time == 0) return null;
        String result = time + " " + unit;
        return time == 1 ? result : result + "s";
    }
}