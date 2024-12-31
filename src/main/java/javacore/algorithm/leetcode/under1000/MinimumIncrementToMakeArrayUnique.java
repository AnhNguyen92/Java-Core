package javacore.algorithm.leetcode.under1000;

import java.util.Arrays;

/**
 * 945. Minimum Increment to Make Array Unique
 */
public class MinimumIncrementToMakeArrayUnique {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i-1]) {
                count += nums[i-1] + 1 - nums[i];
                nums[i] = nums[i-1] + 1;
            }
        }
        return count;
    }
}
