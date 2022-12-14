package javacore.algorithm.leetcode.under1800;

/*
 * Leetcode 1779. Find Nearest Point That Has the Same X or Y Coordinate
 */
public class FindNearestPointThatHasTheSameXOrYCoordinate {
	public int nearestValidPoint(int x, int y, int[][] points) {
        boolean found = false;
        int index = Integer.MAX_VALUE;
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                int z = Math.abs(x - points[i][0]);
                int t = Math.abs(y - points[i][1]);
                if (z == 0) {
                    found = true;
                    if (distance > t) {
                        distance = t;
                        index = i;
                    }
                }
                if (t == 0) {
                    found = true;
                    if (distance > z) {
                        distance = z;
                        index = i;
                    }
                }
            }
        }
        return (found ? index : -1);
    }
}
