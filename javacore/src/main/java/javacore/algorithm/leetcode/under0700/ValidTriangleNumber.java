package javacore.algorithm.leetcode.under0700;

import java.util.Arrays;

/*
 * LeetCode 611. Valid Triangle Number
 */
public class ValidTriangleNumber {
	public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int k = nums.length - 1;
                while (k > j) {
                    if (nums[i] + nums[j] > nums[k]) {
                        count += k - j;
                        break;
                    }
                    k--;
                }
            }
        }
        return count;
    }

}
