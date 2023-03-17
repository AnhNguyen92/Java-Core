package javacore.algorithm.leetcode.under0600;

/*
 * LeetCode 520. Detect Capital
 */
public class DetectCapital {
	public boolean detectCapitalUse(String word) {
		int counter = 0;
		for (char c : word.toCharArray()) {
			if (Character.isUpperCase(c))
				counter++;
		}
		if (counter == 0 || (counter == 1 && Character.isUpperCase(word.charAt(0))) || counter == word.length())
			return true;
		return false;
	}
}
