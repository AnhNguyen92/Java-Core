package javacore.algorithm.leetcode.under1300;

/*
 * Leetcode 1266. Minimum Time Visiting All Points
 */
public class MinimumTimeVisitingAllPoints {
	public int minTimeToVisitAllPoints(int[][] points) {
		if (points.length == 0)
			return 0;
		int steps = 0;
		int xVal, yVal;
		for (int i = 0; i < points.length - 1; i++) {
			xVal = Math.abs(points[i][0] - points[i + 1][0]);
			yVal = Math.abs(points[i][1] - points[i + 1][1]);
			steps += (xVal <= yVal) ? (xVal + (yVal - xVal)) : (yVal + (xVal - yVal));
		}
		return steps;
	}
}
