package _6kyu._6kyu_highest_scoring_word;

/*
Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.
 */

class HighestScoringWord {

    static String high(String s) {

        int highestScore = 0;
        String highestScoredWord = "";

        for (String word : s.split(" ")) {
            int score = 0;
            for (char c : word.toCharArray()) {
                score += c - 'a' + 1;
            }

            if (score > highestScore) {
                highestScore = score;
                highestScoredWord = word;
            }
        }

        return highestScoredWord;
    }
}
