package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2506. Count Pairs Of Similar Strings
 */
public class MaximumEnemyFortsThatCanBeCaptured {

	public int captureForts(int[] forts) {
		int n = forts.length;
		int one = -1;
		int found = -1;
		int ans = 0;
		int count = 0;
		boolean hasChange = false;
		for (int i = 0; i < n; i++) {
			if (forts[i] == 0) {
				count++;
			} else {
				if (forts[i] == -1) {
					if (found < one) {
						hasChange = true;
					}
					found = i;
				} else { // forts[i] == 1
					if (one < found) {
						hasChange = true;
					}
					one = i;
				}
				if (found >= 0 && one >= 0 && hasChange) {
					ans = Math.max(count, ans);
				}
				hasChange = false;
				count = 0;
			}
		}
		return ans;
	}
}
