package javacore.algorithm.leetcode.under0500;

import java.util.Arrays;

/**
 * 452. Minimum Number of Arrows to Burst Balloons
 */
public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        int shot = 0;
        for (int[] point : points) {
            if (count == 0 || shot < point[0]) {
                count++;
                shot = point[1];
            }
        }
        return count;
    }
}
