package javacore.algorithm.leetcode.under2200;

/**
 * 2186. Minimum Number of Steps to Make Two Strings Anagram II
 */
public class MinimumNumberOfStepsToMakeTwoStringsAnagramII {
    public int minSteps(String s, String t) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            arr[c - 'a']--;
        }
        int ans = 0;
        for (int i : arr) {
            ans += Math.abs(i);
        }
        return ans;
    }
}
