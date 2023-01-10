package javacore.algorithm.leetcode.under1900;

/*
 * LeetCode 1893. Check if All the Integers in a Range Are Cover
 */
public class CheckIfAllTheIntegersInARangeAreCovered {
	public boolean isCovered(int[][] ranges, int left, int right) {
		for (int i = left; i <= right; i++) {
			boolean found = false;
			for (int j = 0; j < ranges.length; j++) {
				if (i >= ranges[j][0] && i <= ranges[j][1]) {
					found = true;
					break;
				}
			}
			if (!found) {
				return false;
			}
		}
		return true;
	}
}
