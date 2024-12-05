package javacore.algorithm.leetcode.under1000;

/**
 * 962. Maximum Width Ramp
 */
public class MaximumWidthRamp {
    public int maxWidthRamp(int[] nums) {
        int ramp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] >= nums[i - 1])
                continue;
            for (int j = Math.max(i + ramp, i + 1); j < nums.length; j++) {
                if (nums[j] >= nums[i]) {
                    ramp = Math.max(ramp, j - i);
                }
            }
        }
        return ramp;
    }
}
