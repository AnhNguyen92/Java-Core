package javacore.algorithm.leetcode.under1000;

/*
 * Leetcode 944
 */
public class DeleteColumnsToMakeSorted {
	public int minDeletionSize(String[] nums) {
		int count = 0;
		boolean notFound = false;
		for (int i = 0; i < nums[0].length(); i++) {
			notFound = false;
			for (int j = 1; j < nums.length; j++) {

				if (!notFound && nums[j].charAt(i) - nums[j - 1].charAt(i) < 0) {
					count++;
					notFound = true;
				}
			}
		}
		return count;
	}
}
