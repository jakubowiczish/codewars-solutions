package _8kyu._8kyu_a_needle_in_the_haystack;

/*
Can you find the needle in the haystack?

Write a function findNeedle() that takes an array full of junk but containing one "needle"

After your function finds the needle it should return a message (as a string) that says:

"found the needle at position " plus the index it found the needle, so:

findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"})
should return "found the needle at position 5"
 */

class NeedleInTheHaystack {

    static String findNeedle(Object[] haystack) {
        if (haystack == null || haystack.length == 0) return null;

        for (int i = 0; i < haystack.length; ++i) {
            if ("needle".equals(haystack[i])) {
                return "found the needle at position " + i;
            }
        }

        return null;
    }

    // prettier solution

    static String findNeedle2(Object[] haystack) {
        return "found the needle at position " + java.util.Arrays.asList(haystack).indexOf("needle");
    }
}


