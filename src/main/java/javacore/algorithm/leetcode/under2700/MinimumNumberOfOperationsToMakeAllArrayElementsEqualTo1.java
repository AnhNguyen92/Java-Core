package javacore.algorithm.leetcode.under2700;

/**
 * 2654. Minimum Number of Operations to Make All Array Elements Equal to 1
 */
public class MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1 {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int one = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1)
                one++;
            int currentGCD = 0;
            for (int j = i; j < n; j++) {
                currentGCD = gcd(currentGCD, nums[j]);
                if (currentGCD == 1) {
                    minLength = Math.min(minLength, j - i + 1);
                    break;
                }
            }
        }
        if (one > 0) {
            return n - one;
        }
        if (minLength == Integer.MAX_VALUE)
            return -1;
        return n + minLength - 2;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
