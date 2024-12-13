package javacore.algorithm.leetcode.under2800;

import java.util.Arrays;

/**
 * 2779. Maximum Beauty of an Array After Applying Operation
 */
public class MaximumBeautyOfAnArrayAfterApplyingOperation {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - nums[start] > 2 * k) {
                start++;
            }
            ans = Math.max(i - start + 1, ans);
        }

        return ans;
    }
}
