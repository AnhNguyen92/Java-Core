package javacore.algorithm.leetcode.under1100;

import java.util.HashMap;
import java.util.Map;

/**
 * 1072. Flip Columns For Maximum Number of Equal Rows
 */
public class FlipColumnsForMaximumNumberOfEqualRows {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            String s = str(matrix[i]);
            if (map.containsKey(s)) {
                map.merge(s, 1, Integer::sum);
            } else {
                map.merge(reverse(s), 1, Integer::sum);
            }
        }
        int max = 0;
        for (int i : map.values()) {
            max = Math.max(max, i);
        }
        return max;
    }

    public String str(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int n : arr) {
            sb.append(n);
        }
        return sb.toString();
    }

    private String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '1') sb.append('0');
            else sb.append('1');
        }
        return sb.toString();
    }
}
