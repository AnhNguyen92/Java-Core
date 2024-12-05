package javacore.algorithm.leetcode.under3300;

import java.util.Arrays;

/**
 * 3233. Find the Count of Numbers Which Are Not Special
 */
public class FindTheCountOfNumbersWhichAreNotSpecial {
    public int nonSpecialCount(int l, int r) {
        int count = 0;
        boolean[] primeArr = sieve((int) Math.sqrt(r));
        for (int i = (int) Math.sqrt(l); i < primeArr.length; i++)
            if (primeArr[i])
                if (l <= i * i && i * i <= r) {
                    count++;
                }
        return r + 1 - l - count;
    }

    public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }
}
