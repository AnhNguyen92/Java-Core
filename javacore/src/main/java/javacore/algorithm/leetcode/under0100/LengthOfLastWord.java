package javacore.algorithm.leetcode.under0100;

/*
 * Leet code #58
 */
public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpace = s.lastIndexOf(' ');
        String lastStr = s.substring(lastSpace + 1, s.length());
        return lastStr.length();
    }
}
