package javacore.algorithm.leetcode.under2000;

/*
 * LeetCode 1967. Number of Strings That Appear as Substrings in Word
 */
public class NumberOfStringsThatAppearAsSubstringsInWord {
	public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String s : patterns) {
            if (word.contains(s))
                count++;
        }
        
        return count;
    }
}
