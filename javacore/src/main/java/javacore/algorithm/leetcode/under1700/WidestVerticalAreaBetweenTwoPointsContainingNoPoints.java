package javacore.algorithm.leetcode.under1700;

import java.util.Arrays;

/*
 * LeetCode 1637
 */
public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
	public int maxWidthOfVerticalArea(int[][] points) {
		Arrays.sort(points, (a, b) -> a[0] - b[0]);
		int ans = points[1][0] - points[0][0];
		for (int i = 2; i < points.length; i++) {
			ans = Math.max(ans, points[i][0] - points[i - 1][0]);
		}
		return ans;
	}
}
