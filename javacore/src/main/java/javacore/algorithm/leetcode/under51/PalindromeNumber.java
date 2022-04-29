package javacore.algorithm.leetcode.under51;

/*
 * LeetCode 9
 */
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        int reverse = 0;
        int n = x;
        while (x > 0) {
            reverse *= 10;
            reverse += x % 10;
            x /= 10;
        }
        return n == reverse;
    }
}
