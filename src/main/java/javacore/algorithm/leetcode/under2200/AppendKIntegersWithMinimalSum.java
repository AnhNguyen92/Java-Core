package javacore.algorithm.leetcode.under2200;

import java.util.Arrays;

/**
 * 2195. Append K Integers With Minimal Sum
 */
public class AppendKIntegersWithMinimalSum {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        int idx = 0;
        int start = 1;
        for (int i = 1; i <= k; i++) {
            while (idx < nums.length && start >= nums[idx]) {
                if (start == nums[idx])
                    start++;
                idx++;
            }
            sum += start;
            start++;
        }
        return sum;
    }
}
