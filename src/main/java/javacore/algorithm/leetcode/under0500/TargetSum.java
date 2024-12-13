package javacore.algorithm.leetcode.under0500;

/**
 * 494. Target Sum
 */
public class TargetSum {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        sum(nums, 0, 0, target);
        return count;
    }

    private void sum(int[] nums, int sum, int i, int target) {
        if (i < nums.length) {
            sum(nums, sum - nums[i], i+1, target);
            sum(nums, sum + nums[i], i+1, target);
        } else if (sum == target) {
            count++;
        }
    }
}
