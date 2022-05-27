package javacore.algorithm.leetcode.under1800;

/*
 * Leetcode 1725
 */
public class NumberOfRectanglesThatCanFormTheLargestSquare {
	public int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < rectangles.length; i++) {
            int temp = Math.min(rectangles[i][0], rectangles[i][1]);
            if (temp > max) {
                max = temp;
                count = 1;
            } else if (temp == max) {
                count++;
            }
        }
        return count;
    }
}
