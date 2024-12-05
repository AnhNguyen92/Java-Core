package javacore.algorithm.leetcode.under2000;

/**
 * 1922. Count Good Numbers
 */
public class CountGoodNumbers {
    public int countGoodNumbers(long n) {
        if (n == 1)
            return 5;
        int mod = 1_000_000_007;
        long exponent = n / 2;
        long power5 = power(5, exponent, mod);
        long power4 = power(4, exponent, mod);
        long result = (power5 * power4) % mod;
        if (n % 2 == 1) {
            result = result * 5 % mod;
        }
        return (int) result;
    }

    public static long power(long base, long exp, long mod) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }

        return result;
    }
}
