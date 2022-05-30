package javacore.algorithm.leetcode.under1300;

public class CheckIfItIsAStraightLine {
	public boolean checkStraightLine(int[][] coordinates) {
		int[] slope = new int[] { coordinates[1][1] - coordinates[0][1], coordinates[1][0] - coordinates[0][0] };

		for (int i = 2; i < coordinates.length; i++) {
			int[] tmp = new int[] { coordinates[i][1] - coordinates[0][1], coordinates[i][0] - coordinates[0][0] };
			if (!compareCoordinates(tmp, slope))
				return false;
		}
		return true;
	}

	public static boolean compareCoordinates(int[] a, int[] b) {
		return (a[0] * b[1] == a[1] * b[0]);
	}
}
