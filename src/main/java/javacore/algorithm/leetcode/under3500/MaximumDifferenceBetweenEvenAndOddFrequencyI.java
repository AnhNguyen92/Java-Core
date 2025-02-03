package javacore.algorithm.leetcode.under3500;

/**
 * 3442. Maximum Difference Between Even and Odd Frequency I
 */
public class MaximumDifferenceBetweenEvenAndOddFrequencyI {
    public int maxDifference(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray())
            arr[c - 'a']++;
        int odd = 0;
        int even = s.length();
        for (int i : arr) {
            if (i == 0) continue;
            if (i % 2 == 1) odd = Math.max(odd, i);
            else even = Math.min(even, i);
        }

        return odd - even;
    }
}
