package javacore.algorithm.leetcode.under2300;

/*
 * LeetCode 2221
 */
public class FindTriangularSumOfAnArray {
	public int triangularSum(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++)
                nums[j] = (nums[j] + nums[j+1]) % 10;
        }
        return nums[0];
    }
}
