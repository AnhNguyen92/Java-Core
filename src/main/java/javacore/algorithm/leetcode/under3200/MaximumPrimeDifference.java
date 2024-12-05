package javacore.algorithm.leetcode.under3200;

/**
 * 3115. Maximum Prime Difference
 */
public class MaximumPrimeDifference {
    public int maximumPrimeDifference(int[] nums) {
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                min = i;
                break;
            }
        }
        int max = min;
        for (int i = nums.length - 1; i > min; i--) {
            if (isPrime(nums[i])) {
                max = i;
                break;
            }
        }
        return max - min;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
