package javacore.algorithm.leetcode.under3100;

/**
 * 3079. Find the Sum of Encrypted Integers
 */
public class FindTheSumOfEncryptedIntegers {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += encrypt(i);
        }
        return sum;
    }

    private int encrypt(int x) {
        int mul = 0;
        int max = -1;
        while (x > 0) {
            max = Math.max(x % 10, max);
            x /= 10;
            mul = mul * 10 + 1;
        }

        return mul * max;
    }
}
