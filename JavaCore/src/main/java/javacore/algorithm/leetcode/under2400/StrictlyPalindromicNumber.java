package javacore.algorithm.leetcode.under2400;

/*
 * LeetCode 2396
 */
public class StrictlyPalindromicNumber {
    public boolean isStrictlyPalindromic(int n) {
        return false;
    }

    public boolean isStrictlyPalindromic1(int n) {
        for(int i = 2; i < n-1; i++) {
            String number = Integer.toString(n, i);
            int length = number.length();
            for (int j = 0, k = length - 1; j < length / 2; j++, k--) {
                if(number.charAt(j) != number.charAt(k)) {
                    return false;
                }
            }
        }
        return true;
    }
}
