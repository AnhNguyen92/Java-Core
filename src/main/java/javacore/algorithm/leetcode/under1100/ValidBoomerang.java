package javacore.algorithm.leetcode.under1100;

/*
 * LeetCode 1037. Valid Boomerang
 */
public class ValidBoomerang {
	public boolean isBoomerang(int[][] points) {
		int xA = points[0][0];
		int yA = points[0][1];
		int xB = points[1][0];
		int yB = points[1][1];
		int xC = points[2][0];
		int yC = points[2][1];
		if ((xA == xB && yA == yB) || (xA == xC && yA == yC) || (xC == xB && yC == yB))
			return false;
		double a = (double) Math.sqrt((yC - yB) * (yC - yB) + (xC - xB) * (xC - xB));
		double b = (double) Math.sqrt((yA - yC) * (yA - yC) + (xA - xC) * (xA - xC));
		double c = (double) Math.sqrt((yA - yB) * (yA - yB) + (xA - xB) * (xA - xB));
		return !((a + b == c) || (b + c == a) || (a + c == b));
	}
}
