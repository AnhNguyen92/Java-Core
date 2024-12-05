package javacore.algorithm.leetcode.under2300;

/**
 * 2275. Largest Combination With Bitwise AND Greater Than Zero
 */
public class LargestCombinationWithBitwiseANDGreaterThanZero {
    public int largestCombination(int[] candidates) {
        int[] arr = new int[24];
        for (int n : candidates) {
            int i = 23;
            while (n > 0) {
                arr[i--] += n % 2;
                n /= 2;
            }
        }
        int max = 0;
        for (int i = 0; i < 24; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
