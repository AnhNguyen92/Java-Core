package javacore.algorithm.leetcode.under2400;

/*
 * LeetCode 2309. Greatest English Letter in Upper and Lower Case
 */
public class GreatestEnglishLetterInUpperAndLowerCase {

	public String greatestLetter(String s) {
		boolean[][] arr = new boolean[26][2];
		int max = -1;
		char c;
		int idx;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (Character.isLowerCase(c)) {
				idx = c- 'a';
				arr[c - 'a'][0] = true;
			} else {
				idx = c- 'A';
				arr[idx][1] = true;
			}
			if (arr[idx][0] && arr[idx][1] && idx > max) {
				max = idx;
			}
		}
		return max >= 0 ? ("" + (char) (65 + max)) : "";
	}

}
