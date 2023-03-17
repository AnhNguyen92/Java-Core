package javacore.algorithm.leetcode.under0400;

/*
 * LeetCode 400. Nth Digit
*/
public class NthDigit {
	public int findNthDigit(int n) {
        int i = 0;
        while (9 * (i + 1) * Math.pow(10, i) < n) {
            n -= 9 * (i + 1) * Math.pow(10, i);
            i++;
        }
        int x = (int) Math.pow(10, i) + n / (i+1);
        int remainder = n % (1 + i);
        if (remainder == 0) {
            x--;
            return x % 10;
        }
        return x / ((int) Math.pow(10, i + 1 - remainder)) % 10;
    }
}
