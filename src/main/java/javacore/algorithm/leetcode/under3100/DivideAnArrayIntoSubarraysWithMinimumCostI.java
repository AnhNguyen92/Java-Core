package javacore.algorithm.leetcode.under3100;

/**
 * 3010. Divide an Array Into Subarrays With Minimum Cost I
 */
public class DivideAnArrayIntoSubarraysWithMinimumCostI {
    public int minimumCost(int[] nums) {
        int a = nums[0];
        int small = Math.min(nums[1], nums[2]);
        int big = Math.max(nums[1], nums[2]);
        for (int i = 3; i < nums.length; i++) {
            if (nums[i] < small) {
                big = small;
                small = nums[i];
            } else if (nums[i] < big) {
                big = nums[i];
            }
        }

        return nums[0] + big + small;
    }
}
