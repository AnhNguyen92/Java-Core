package javacore.algorithm.leetcode.under3300;

/**
 * 3223. Minimum Length of String After Operations
 */
public class MinimumLengthOfStringAfterOperations {
    public int minimumLength(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        int ans = 0;
        for (int i : arr) {
            if (i > 0)
                ans += (i % 2 == 0) ? 2 : 1;
        }
        return ans;
    }
}
