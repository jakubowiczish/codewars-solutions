package _6kyu._6kyu_detect_pangram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
A pangram is a sentence that contains every single letter of the alphabet at least once.
For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram.
Return True if it is, False if not. Ignore numbers and punctuation.
 */

public class PangramChecker {

    public boolean check(String sentence) {
        for (char c = 'a'; c <= 'z'; ++c) {
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        }

        return true;
    }

    public boolean check2(String sentence) {
        String replacedSentence = sentence.replaceAll("[^A-Za-z]", "");
        Set<String> lettersInSentence = new HashSet<>(Arrays.asList(replacedSentence.split("")));
        return lettersInSentence.size() >= 26;
    }
}
