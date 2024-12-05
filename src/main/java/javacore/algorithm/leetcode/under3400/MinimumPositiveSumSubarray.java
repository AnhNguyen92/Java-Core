package javacore.algorithm.leetcode.under3400;

import java.util.List;

/**
 * 3364. Minimum Positive Sum Subarray
 */
public class MinimumPositiveSumSubarray {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = -1;
        int range;
        int n = nums.size();
        for (int i = 0; i <= n - l; i++) {
            int sum = 0;
            range = 0;
            for (int j = i; j < n; j++) {
                sum += nums.get(j);
                range++;
                if (range >= l && range <= r && sum > 0) {
                    if (min < 0) {
                        min = sum;
                    } else {
                        min = Math.min(sum, min);
                    }
                }
            }
        }
        return min;
    }
}
