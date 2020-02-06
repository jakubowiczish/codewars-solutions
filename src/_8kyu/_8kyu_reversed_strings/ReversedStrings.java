package _8kyu._8kyu_reversed_strings;

/*
Complete the solution so that it reverses the string value passed into it.

Kata.solution("world") //returns "dlrow"
 */
public class ReversedStrings {

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
