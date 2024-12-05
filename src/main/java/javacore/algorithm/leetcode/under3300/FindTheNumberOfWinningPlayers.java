package javacore.algorithm.leetcode.under3300;

import java.util.HashSet;
import java.util.Set;

/**
 * 3238. Find the Number of Winning Players
 */
public class FindTheNumberOfWinningPlayers {
    public int winningPlayerCount(int n, int[][] pick) {
        int[][] arr = new int[11][11];
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                arr[i][j] = -1;
            }
        }
        for (int[] item : pick) {
            arr[item[0]][item[1]]++;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (arr[i][j] >= i) {
                    set.add(i);
                }
            }
        }
        return set.size();
    }
}
