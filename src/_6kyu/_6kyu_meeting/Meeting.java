package _6kyu._6kyu_meeting;

import java.util.Arrays;

/*
John has invited some friends. His list is:

s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
Could you make a program that

makes this string uppercase
gives it sorted in alphabetical order by last name.
When the last names are the same, sort them by first name. Last name and first name of a guest come in the result between parentheses separated by a comma.

So the result of function meeting(s) will be:

"(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
It can happen that in two distinct families with the same family name two people have the same first name too.

Notes
You can see another examples in the "Sample tests".
 */

class Meeting {

    static String meeting(String s) {
        String[] people = s.split(";");

        for (int i = 0; i < people.length; ++i) {
            int semicolonIndex = people[i].indexOf(":");
            people[i] = "(" + people[i].substring(semicolonIndex + 1).toUpperCase() + ", "
                    + people[i].substring(0, semicolonIndex).toUpperCase() + ")";
        }

        Arrays.sort(people);

        return String.join("", people);
    }
}
