package javacore.algorithm.leetcode.under3000;

import java.util.ArrayList;
import java.util.List;

/**
 * 2924. Find Champion II
 */
public class FindChampionII {
    public int findChampion(int n, int[][] edges) {
        if (edges.length == 0)
            return n > 1 ? -1 : 0;
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++)
            lst.add(i);
        for (int[] arr : edges) {
            lst.remove(Integer.valueOf(arr[1]));
        }
        if (lst.size() > 1)
            return -1;
        return lst.get(0);
    }
}
