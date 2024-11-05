package javacore.algorithm.leetcode.under3200;

/**
 * 3153. Sum of Digit Differences of All Pairs
 */
public class SumOfDigitDifferencesOfAllPairs {
    public long sumDigitDifferences(int[] nums) {
        String s = "" + nums[0];
        int m = s.length();
        int n = nums.length;

        long ans = 0;
        for (int i = m - 1; i >= 0; i--) {
            int[] arr = new int[10];
            for (int j = 0; j < n; j++) {
                arr[nums[j] % 10]++;
                nums[j] /= 10;
            }
            for (int j = 0; j <= 9; j++) {
                ans += (long) arr[j] * (n - arr[j]);
            }
        }
        return ans/2;
    }
}
