package javacore.algorithm.leetcode.under2200;

import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 2133. Check if Every Row and Column Contains All Numbers
 */
public class CheckIfEveryRowAndColumnContainsAllNumbers {
	public boolean checkValid(int[][] matrix) {
        Set<Integer> set;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                set.add(matrix[i][j]);
            }
            if (set.size() < n)
                return false;
        }
        for (int j = 0; j < n; j++) {
            set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(matrix[i][j]);
            }
            if (set.size() < n)
                return false;
        }
        return true;
    }
}
