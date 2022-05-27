package javacore.algorithm.leetcode.under1800;

/*
 * Leetcode 1758
 */
public class MinimumChangesToMakeAlternatingBinaryString {
	public int minOperations(String s) {
        int ones = 0;
        int zeros = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '1') {
                    zeros++;
                } else {
                    ones++;
                }
            } else {
                if (s.charAt(i) == '1') {
                    ones++;
                } else {
                    zeros++;
                }
            }
        }
        return Math.min(ones, zeros);
    }
}
