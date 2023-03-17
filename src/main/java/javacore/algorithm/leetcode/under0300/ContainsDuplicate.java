package javacore.algorithm.leetcode.under0300;

import java.util.Arrays;

/*
 * LeetCode 217. Contains Duplicate
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
