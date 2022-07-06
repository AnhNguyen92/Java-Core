package javacore.algorithm.leetcode.under0400;

/*
 * LeetCode 376
 */
public class WiggleSubsequence {

	public int wiggleMaxLength(int[] nums) {
		if (nums.length == 1) {
			return 1;
		}
		int presign = 0;
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				int sign = (nums[i] > nums[i - 1]) ? 1 : -1;
				if (sign != presign) {
					presign = sign;
					if (presign != 0)
						count++;
				}
			}
		}
		return count;
	}
}
