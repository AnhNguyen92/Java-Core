package javacore.algorithm.leetcode.under3000;

/**
 * 2923. Find Champion I
 */
public class FindChampionI {
    public int findChampion(int[][] grid) {
        int[] arr = new int[grid.length];
        for (int[] ints : grid) {
            for (int j = 0; j < grid.length; j++) {
                if (ints[j] == 1) {
                    arr[j] = 1;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return 0;
    }
}
