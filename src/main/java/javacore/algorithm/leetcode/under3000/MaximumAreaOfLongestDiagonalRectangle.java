package javacore.algorithm.leetcode.under3000;

/**
 * 3000. Maximum Area of Longest Diagonal Rectangle
 */
public class MaximumAreaOfLongestDiagonalRectangle {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int d = 0;
        int maxD = 0;
        int res = 0;
        int area = 0;
        for (int i = 0; i < dimensions.length; i++) {
            d = dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1];
            area = dimensions[i][0] * dimensions[i][1];
            if (d > maxD || (maxD == d && res < area)) {
                maxD = d;
                res = area;
            }
        }

        return res;
    }
}
