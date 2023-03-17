package javacore.algorithm.leetcode.under1800;

/*
 * LeetCode 1752. Check if Array Is Sorted and Rotated
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
