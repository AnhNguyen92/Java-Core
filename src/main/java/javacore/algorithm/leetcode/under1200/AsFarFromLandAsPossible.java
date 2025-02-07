package javacore.algorithm.leetcode.under1200;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 1162. As Far from Land as Possible
 */
public class AsFarFromLandAsPossible {
    public int maxDistance(int[][] grid) {
        int n = grid.length;
        int ans = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    visited[i][j] = true;
                    queue.add(new int[]{ i, j });
                }
            }
        }
        if (queue.isEmpty() || queue.size() == n * n) {
            return -1;
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] ar = queue.poll();

                if (ar[0] > 0 && !visited[ar[0] - 1][ar[1]]) {
                    visited[ar[0] - 1][ar[1]] = true;
                    queue.add(new int[]{ar[0] - 1, ar[1]});
                }
                if (ar[0] + 1 < n && !visited[ar[0] + 1][ar[1]]) {
                    visited[ar[0] + 1][ar[1]] = true;
                    queue.add(new int[]{ar[0] + 1, ar[1]});
                }
                if (ar[1] > 0 && !visited[ar[0]][ar[1] - 1]) {
                    visited[ar[0]][ar[1] - 1] = true;
                    queue.add(new int[]{ar[0], ar[1] - 1});
                }
                if (ar[1] + 1 < n && !visited[ar[0]][ar[1] + 1]) {
                    visited[ar[0]][ar[1]+1] = true;
                    queue.add(new int[]{ar[0], ar[1] + 1});
                }
            }
            ans++;
        }
        return ans - 1;
    }
}
