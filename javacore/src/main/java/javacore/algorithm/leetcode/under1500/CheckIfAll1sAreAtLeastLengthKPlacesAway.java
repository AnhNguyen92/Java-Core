package javacore.algorithm.leetcode.under1500;

/*
 * LeetCode 1437
 */
public class CheckIfAll1sAreAtLeastLengthKPlacesAway {
	public boolean kLengthApart(int[] nums, int k) {
		int count = k;
		for (int num : nums) {
			if (num == 1) {
				if (count < k) {
					return false;
				}
				count = 0;
			} else {
				++count;
			}
		}
		return true;
	}
}
