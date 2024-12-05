package javacore.algorithm.leetcode.under3400;

/**
 * 3345. Smallest Divisible Digit Product I
 */
public class SmallestDivisibleDigitProductI {
    public int smallestNumber(int n, int t) {
        while (product(n) % t != 0) {
            n++;
        }
        return n;
    }

    private int product(int n) {
        int prod = 1;
        while (n > 0) {
            prod *= n % 10;
            n /= 10;
        }
        return prod;
    }
}
