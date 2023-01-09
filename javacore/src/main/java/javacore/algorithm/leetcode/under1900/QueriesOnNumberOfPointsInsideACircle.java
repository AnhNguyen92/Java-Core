package javacore.algorithm.leetcode.under1900;

/*
 * LeetCode 1828. Queries on Number of Points Inside a Circle
 */
public class QueriesOnNumberOfPointsInsideACircle {
	public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            for (int[] point : points) {
                int x = query[0] - point[0];
                int y = query[1] - point[1];
                if (x * x + y * y <= query[2]*query[2]) {
                    ans[i]++;
                }
            }
        }
        return ans;
    }
}
