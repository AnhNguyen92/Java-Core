package javacore.algorithm.leetcode.under2800;

import java.util.Arrays;

/**
 * 2784. Check if Array is Good
 */
public class CheckIfArrayIsGood {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n - 1] == n - 1 && nums[n - 1] == nums[n - 2];
    }
}
