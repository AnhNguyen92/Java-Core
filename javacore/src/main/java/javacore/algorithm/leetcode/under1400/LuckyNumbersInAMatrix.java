package javacore.algorithm.leetcode.under1400;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1380
 */
public class LuckyNumbersInAMatrix {
	public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int ans = 0;
        int col = 0;
        for (int i = 0; i < matrix.length; i++) {
            ans = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < ans) {
                    ans = matrix[i][j];
                    col = j;
                }
            }
            int count = 0;
            for (int k = 0; k < matrix.length; k++) {
                if (ans >= matrix[k][col]) {
                    count++;
                }
            }
            if (count == matrix.length) {
                list.add(ans);
            }
        }
        return list;
    }
}
