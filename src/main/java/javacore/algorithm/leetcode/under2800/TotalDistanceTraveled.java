package javacore.algorithm.leetcode.under2800;

/*
 * LeetCode 2739. Total Distance Traveled
 */
public class TotalDistanceTraveled {
	public int distanceTraveled(int mainTank, int additionalTank) {
		int distance = 0;
		while (mainTank >= 5 && additionalTank > 0) {
			int min = Math.min(mainTank / 5, additionalTank);
			additionalTank -= min;
			mainTank -= min * 4;
			distance += min * 50;
		}
		return distance + mainTank * 10;
	}
}
