package javacore.algorithm.leetcode.under1000;

/*
 * LeetCode 953. Verifying an Alien Dictionary
 */
public class VerifyingAnAlienDictionary {
	public boolean isAlienSorted(String[] words, String order) {
		for (int i = 0; i <= words.length - 2; i++) {
			String word1 = words[i];
			String word2 = words[i + 1];
			if (!isLexicographicaly(word1, word2, order)) {
				return false;
			}
		}
		return true;
	}

	public boolean isLexicographicaly(String w1, String w2, String order) {
		for (int j = 0; j < w1.length(); j++) {
			int index1 = order.indexOf(w1.charAt(j));
			int index2 = j >= w2.length() ? -1 : order.indexOf(w2.charAt(j));
			if (index1 < index2) {
				return true;
			}
			if (index1 > index2) {
				return false;
			}
		}
		return true;
	}
}
