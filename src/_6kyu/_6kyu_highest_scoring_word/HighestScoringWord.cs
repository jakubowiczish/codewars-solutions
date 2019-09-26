/*
Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.
 */

public class Kata {
	public static string High(string s) {
		int highestScore = 0;
		string highestScoredWord = "";

		foreach(string word in s.Split(" ")) {
			int score = 0;
			foreach(char c in word) {
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