package _7kyu._7kyu_remove_duplicate_words;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
Your task is to remove all duplicate words from a string,
leaving only single (first) words entries.

Example:

Input:

'alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta'

Output:

'alpha beta gamma delta'
 */

class RemoveDuplicateWords {

    static String removeDuplicateWords(String s) {
        return Arrays.stream(s.split(" "))
                .distinct()
                .collect(Collectors.joining(" "));
    }
}
