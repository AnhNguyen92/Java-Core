package javacore.algorithm.leetcode.under1400;

/**
 * 1400. Construct K Palindrome Strings
 */
public class ConstructKPalindromeStrings {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k)
            return false;
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 1) {
                count++;
            }
        }
        return count <= k;
    }
}
