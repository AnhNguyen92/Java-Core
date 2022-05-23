package javacore.algorithm.leetcode.under2300;

/*
 * Leetcode 2278
 */
public class PercentageOfLetterInString {
	public int percentageLetter(String s, char letter) {
        int count = 0;
        for (char c : s.toCharArray()) {
        	if (c == letter) {
        		count++;        		
        	}
        }
        return 100 * count / s.length();
    }
}
