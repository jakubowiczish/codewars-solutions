package a_needle_in_the_haystack;

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


