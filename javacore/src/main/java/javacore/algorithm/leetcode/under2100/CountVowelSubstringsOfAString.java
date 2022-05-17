package javacore.algorithm.leetcode.under2100;

/*
 * LeetCode 2062
 */
public class CountVowelSubstringsOfAString {
	public int countVowelSubstrings(String word) {
		int count = 0;
        boolean foundA = false;
		boolean foundE = false;
		boolean foundI = false;
		boolean foundO = false;
		boolean foundU = false;
		for (int i = 0; i <= word.length() - 5; i++) {
			foundA = false;
			foundE = false;
			foundI = false;
			foundO = false;
			foundU = false;
			for (int j = i; j < word.length(); j++) {
				if (word.charAt(j) == 'a') {
					foundA = true;
				} else if (word.charAt(j) == 'e') {
					foundE = true;
				} else if (word.charAt(j) == 'i') {
					foundI = true;
				} else if (word.charAt(j) == 'o') {
					foundO = true;
				} else if (word.charAt(j) == 'u') {
					foundU = true;
				} else {
                    if (!foundA || !foundE || !foundI || !foundO || !foundU) {
						i = j;
					}
					break;
				}
				if (foundA && foundE && foundI && foundO && foundU) {
					count++;
				}
			}
			
		}

		return count;
	}
}
