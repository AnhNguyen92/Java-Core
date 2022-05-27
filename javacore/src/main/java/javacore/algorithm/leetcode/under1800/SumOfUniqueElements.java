package javacore.algorithm.leetcode.under1800;

import java.util.Arrays;

/*
 * Leetcode 1748
 */
public class SumOfUniqueElements {
	public int sumOfUnique(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                if (nums[i] != nums[i-1] && (i == nums.length - 1 || nums[i] != nums[i+1]) ) {
                    sum += nums[i];
                }
            } else if (nums[i] != nums[i+1]) {
                    sum += nums[i];
            }
        }
        return sum;
    }
}
