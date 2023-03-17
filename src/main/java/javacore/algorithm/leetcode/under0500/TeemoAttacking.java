package javacore.algorithm.leetcode.under0500;

/*
 * LeetCode 495. Teemo Attacking
 */
public class TeemoAttacking {
	public int findPoisonedDuration(int[] timeSeries, int duration) {
		int max = duration;
		int curr = timeSeries[0] + duration - 1;
		for (int k = 1; k < timeSeries.length; k++) {
			int i = timeSeries[k];
			max += duration;
			if (i > curr) {
				curr = i + duration - 1;
			} else if (i == curr) {
				max -= 1;
				curr += duration - 1;
			} else if (i + duration > curr) {
				max += i - 1 - curr;
				curr = i + duration - 1;
			}
        }
        return max;
    }
}
