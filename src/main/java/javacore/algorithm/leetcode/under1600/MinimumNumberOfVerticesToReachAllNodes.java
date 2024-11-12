package javacore.algorithm.leetcode.under1600;

import java.util.ArrayList;
import java.util.List;

/**
 * 1557. Minimum Number of Vertices to Reach All Nodes
 */
public class MinimumNumberOfVerticesToReachAllNodes {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] brr = new boolean[n];
        for (List<Integer> item : edges) {
            brr[item.get(1)] = true;
        }
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!brr[i]) {
                lst.add(i);
            }
        }
        return lst;
    }
}
