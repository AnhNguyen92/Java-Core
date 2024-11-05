package javacore.algorithm.leetcode.under3100;

/**
 * 3090. Maximum Length Substring With Two Occurrences
 */
public class MaximumLengthSubstringWithTwoOccurrences {
    public int maximumLengthSubstring(String s) {
        int max = 1;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] arr = new int[26];
            sum = 0;
            for (int j = i; j < s.length(); j++) {
                if (++arr[s.charAt(j) - 'a'] > 2) {
                    break;
                } else {
                    sum++;
                }
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
