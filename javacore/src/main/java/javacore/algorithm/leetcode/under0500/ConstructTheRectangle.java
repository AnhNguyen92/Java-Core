package javacore.algorithm.leetcode.under0500;

/*
 * Leetcode 492. Construct the Rectangle
 */
public class ConstructTheRectangle {
	public int[] constructRectangle(int area) {
		int a = (int) Math.sqrt(area);
		while (area % a != 0) {
			a--;
		}
		return new int[] { Math.max(a, area / a), Math.min(a, area / a) };
	}
}
