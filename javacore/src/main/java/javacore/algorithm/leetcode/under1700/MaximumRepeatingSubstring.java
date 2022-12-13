package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1668. Maximum Repeating Substring
 */
public class MaximumRepeatingSubstring {
	public int maxRepeating(String sequence, String word) {
        int count = 0;
        String item = word;
        while (sequence.indexOf(item) >= 0) {
            count++;
            item += word;
        }
        return count;
    }
}
