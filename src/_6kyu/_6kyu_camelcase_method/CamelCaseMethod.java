package _6kyu._6kyu_camelcase_method;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
Write simple .camelCase method
(camel_case function in PHP,
CamelCase in C#
or camelCase in Java) for strings.
All words must have their first letter capitalized without spaces.

For instance:

camelCase("hello case"); // => "HelloCase"
camelCase("camel case word"); // => "CamelCaseWord"
Don't forget to rate this kata! Thanks :)
 */

class CamelCaseMethod {

    static String camelCase(String str) {
        return Arrays.stream(str.split("\\s"))
                .filter(e -> !e.isEmpty())
                .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase())
                .collect(Collectors.joining())
                .replaceAll("\\s", "");
    }
}
