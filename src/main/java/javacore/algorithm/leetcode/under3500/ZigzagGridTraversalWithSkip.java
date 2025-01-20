package javacore.algorithm.leetcode.under3500;

import java.util.ArrayList;
import java.util.List;

/**
 * 3417. Zigzag Grid Traversal With Skip
 */
public class ZigzagGridTraversalWithSkip {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> lst = new ArrayList<>();
        int start = (grid[0].length % 2 == 0) ? (grid[0].length - 1) : (grid[0].length - 2);
        for (int i = 0; i < grid.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < grid[i].length; j += 2)
                    lst.add(grid[i][j]);
            } else {
                for (int j = start; j >= 0; j -= 2)
                    lst.add(grid[i][j]);
            }
        }
        return lst;
    }
}
