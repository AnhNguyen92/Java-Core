package javacore.algorithm.leetcode.under2100;

/*
 * LeetCode 2047
*/
public class NumberOfValidWordsInASentence {
	public int countValidWords(String sentence) {
		int count = 0;
		String[] strArr = sentence.split(" ");
		for (String s : strArr) {
			if (s.length() > 0 && isValidWord(s)) {
				count++;
			}
		}
		return count;
	}

	private boolean isValidWord(String s) {
		int hyphens = 0;
		int punctutation = 0;
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {

				return false;
			}
			if (c == '-') {
				hyphens++;
				if (i == 0 || i == len - 1 || hyphens == 2
						|| (!Character.isLetter(s.charAt(i - 1)) || !Character.isLetter(s.charAt(i + 1)))) {
					return false;
				}
			}
			if (isPunctuation(c)) {
				punctutation++;
				if (i < len - 1 || punctutation == 2) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean isPunctuation(char c) {
		return c == '!' || c == '.' || c == ',';
	}
}
