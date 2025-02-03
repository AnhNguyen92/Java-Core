package javacore.algorithm.leetcode.under2100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 2017. Grid Game
 */
public class GridGame {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        if (n == 1)
            return 0;
        long sum = 0L;
        List<Long> first = new ArrayList<>();
        List<Long> second = new ArrayList<>();
        for (int j = n - 1; j >= 1; j--) {
            sum += grid[0][j];
            first.add(sum);
        }
        sum = 0;
        for (int j = 0; j < n - 1; j++) {
            sum += grid[1][j];
            second.add(Math.min(first.get(n - 2 - j), sum));
        }
        Collections.sort(second);
        return second.get(second.size() - 1);
    }
}
