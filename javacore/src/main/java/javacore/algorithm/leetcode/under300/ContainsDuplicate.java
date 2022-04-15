package javacore.algorithm.leetcode.under300;

import java.util.Arrays;

/*
 * Leet code #217
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean ans = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                ans = true;
                break;
            }
        }
        return ans;
    }
}
