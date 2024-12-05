package javacore.algorithm.leetcode.under2900;

/**
 * 2825. Make String a Subsequence Using Cyclic Increments
 */
public class MakeStringASubsequenceUsingCyclicIncrements {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0;
        int j = 0;
        char c, d;
        int m = str1.length();
        int n = str2.length();
        while (i < m && j < n) {
            c = str1.charAt(i);
            d = str2.charAt(j);
            if (d == c || (d - c + 26) % 26 == 1) {
                j++;
            }
            i++;
            if (j == n) {
                return true;
            } else if (i == m) {
                return false;
            }
        }
        return true;
    }
}
