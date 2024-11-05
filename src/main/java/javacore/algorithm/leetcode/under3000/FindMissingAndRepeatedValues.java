package javacore.algorithm.leetcode.under3000;

import java.util.ArrayList;
import java.util.List;

/**
 * 2965. Find Missing and Repeated Values
 */
public class FindMissingAndRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[grid.length * grid.length + 1];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                arr[grid[i][j]]++;
            }
        }
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 == 0)
                lst.add(i);
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0)
                lst.add(i);
        }
        int[] res = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            res[i] = lst.get(i);
        }
        return res;
    }
}
