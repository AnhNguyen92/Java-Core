package javacore.algorithm.leetcode.under1800;

/*
 * Leetcode 1791
 */
public class FindCenterOfStarGraph {
	public int findCenter(int[][] edges) {
        if (edges == null || edges.length <= 1) {
            return -1;
        }
        var result = 0;
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            result = edges[0][0];
        }
        if (edges[0][1] == edges[1][0] || edges[0][1] == edges[1][1]) {
            result = edges[0][1];
        }
        return result;
    }
}