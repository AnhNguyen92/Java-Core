package javacore.algorithm.leetcode.under0100;

/*
 * LeetCode 58. Length of Last Word
 */
public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		s = s.trim();
		int lastSpace = s.lastIndexOf(' ');
		String lastStr = s.substring(lastSpace + 1);
		return lastStr.length();
	}
}
