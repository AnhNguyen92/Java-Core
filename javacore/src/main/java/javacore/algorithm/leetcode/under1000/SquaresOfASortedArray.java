package javacore.algorithm.leetcode.under1000;

import java.util.Arrays;

/*
 * Leetcode 977
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
