package javacore.algorithm.leetcode.under2500;

import java.util.Arrays;

/*
 * Leetcode 2500. Delete Greatest Value in Each Row
 */
public class DeleteGreatestValueInEachRow {
	public int deleteGreatestValue(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
        	Arrays.sort(grid[i]);
        }
        int max;
        for (int j = grid[0].length - 1; j >= 0; j--) {
        	max = grid[grid.length -1][j];
        	for (int i = 0; i < grid.length; i++) {
            	if (grid[i][j] > max) {
            		max = grid[i][j];
            	}
            }
        	ans += max;
        }
        
        return ans;
    }
}
