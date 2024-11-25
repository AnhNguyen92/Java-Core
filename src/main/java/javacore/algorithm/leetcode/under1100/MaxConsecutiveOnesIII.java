package javacore.algorithm.leetcode.under1100;

/**
 * 1004. Max Consecutive Ones III
 */
public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int l = 0;
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
                if (zero > k) {
                    max = Math.max(max, i - l);
                    while (zero > k) {
                        if (nums[l] == 0) {
                            zero--;
                        }
                        l++;
                    }
                }
            }
            if (i == nums.length - 1) {
                max = Math.max(max, i - l + 1);
            }
        }
        return max;
    }
}
