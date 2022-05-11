package javacore.algorithm.leetcode.under0700;

/*
 * LeetCode 665
 */
public class NonDecreasingArray {
	public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = nums.length-1; i>=1; i--) {
            if (nums[i] < nums[i-1]) {
                if (i == nums.length - 1) {
                    nums[i] = nums[i-1];
                } else if (i == 1) {
                    nums[i-1] = nums[i];
                } else {
                    if (nums[i-1] > nums[i+1]) {
                        nums[i-1] = nums[i];
                    } else {
                        nums[i] = nums[i+1];
                    }
                    
                }
                count++;
                if (count == 2)
                    return false;
            }
        }
        return count < 2;
    }
}
