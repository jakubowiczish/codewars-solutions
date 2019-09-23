package _7kyu._7kyu_string_ends_with;

/*
Complete the solution so that it returns true if
the first argument(string) passed in ends with the 2nd argument (also a string).

Examples:

solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false
 */

class StringEndsWith {

    public static boolean solution(String str, String ending) {
        return str != null && str.endsWith(ending);
    }
}

