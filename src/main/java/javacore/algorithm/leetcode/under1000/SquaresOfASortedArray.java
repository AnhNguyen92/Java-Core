package javacore.algorithm.leetcode.under1000;

import java.util.Arrays;

/*
 * LeetCode 977. Squares of a Sorted Array
 */
public class SquaresOfASortedArray {
	public int[] sortedSquares(int[] nums) {
	       for (int i = 0; i < nums.length; i++) {
	           nums[i] *= nums[i];
	       }
	        Arrays.sort(nums);
	        return nums;
	    }
}
