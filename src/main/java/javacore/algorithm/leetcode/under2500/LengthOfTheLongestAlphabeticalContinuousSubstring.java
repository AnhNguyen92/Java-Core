package javacore.algorithm.leetcode.under2500;

/**
 * 2414. Length of the Longest Alphabetical Continuous Substring
 */
public class LengthOfTheLongestAlphabeticalContinuousSubstring {
    public int longestContinuousSubstring(String s) {
        int ans = 1;
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) - s.charAt(i-1) == 1)
                count++;
            else {
                ans = Math.max(count, ans);
                count = 1;
            }
        }
        return Math.max(count, ans);
    }
}
