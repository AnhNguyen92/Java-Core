package javacore.algorithm.leetcode.under2300;

import java.util.Arrays;

/*
 * LeetCode 2294
 */
public class PartitionArraySuchThatMaximumDifferenceIsK {
	public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 1;
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - nums[curr] > k) {
                count++;
                curr = i;
            }
            
        }
        return count;
    }
}
