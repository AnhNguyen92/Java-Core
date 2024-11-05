package javacore.algorithm.leetcode.under3100;

import java.util.HashMap;
import java.util.Map;

/**
 * 3033. Modify the Matrix
 */
public class ModifyTheMatrix {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[] arr = new int[51];
        Map<int[], Integer> map = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j  = 0; j < matrix[i].length; j++) {
                arr[j] = Math.max(arr[j], matrix[i][j]);
                if (matrix[i][j] == -1) {
                    map.put(new int[] {i, j}, 1);
                }
            }
        }
        map.forEach((k,v) -> {
            matrix[k[0]][k[1]] = arr[k[1]];
        });
        return matrix;
    }
}
