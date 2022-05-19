package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode #27
 */
public class RemoveElement {
	public int removeElement(int[] nums, int val) {

		int counter = 0;
		int i = 0;
		int j = nums.length - 1;
		while (i <= j) {
			if (nums[i] == val) {
				nums[i] = nums[j];
				nums[j] = val;
				j--;
				counter++;
			} else {
				i++;
			}
		}

		return (nums.length - counter);
	}
}
