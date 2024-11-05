package javacore.algorithm.leetcode.under3100;

/**
 * 3099. Harshad Number
 */
public class HarshadNumber {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n = x;
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return (x % s == 0) ? s : -1;
    }
}
