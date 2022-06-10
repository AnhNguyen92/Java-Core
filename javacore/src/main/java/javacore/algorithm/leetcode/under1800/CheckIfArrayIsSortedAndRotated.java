package javacore.algorithm.leetcode.under1800;

/*
 * Leetcode 1752
 */
public class CheckIfArrayIsSortedAndRotated {
	public boolean check(int[] nums) {
		int count = 0;
		for (int i = 1; i < nums.length; i++)
			if (nums[i - 1] > nums[i])
				count++;
		if (nums[nums.length - 1] > nums[0])
			count++;
		if (count > 1)
			return false;
		return true;
	}
}