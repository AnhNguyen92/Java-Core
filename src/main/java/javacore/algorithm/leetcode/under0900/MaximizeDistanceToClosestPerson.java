package javacore.algorithm.leetcode.under0900;

/*
 * LeetCode 849. Maximize Distance to Closest Person
 */
public class MaximizeDistanceToClosestPerson {
	public int maxDistToClosest(int[] seats) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < seats.length; i++) {
			if (seats[i] == 0) {
				count++;
			} else {
				if (i - count > 0) {
					if (count % 2 == 1) {
						count = count / 2 + 1;
					} else {
						count /= 2;
					}
				}
				if (count > max) {
					max = count;
				}
				count = 0;
			}
		}
		if (count > max) {
			max = count;
		}
		return max;
	}
}
