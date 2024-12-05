package javacore.algorithm.leetcode.under2800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2761. Prime Pairs With Target Sum
 */
public class PrimePairsWithTargetSum {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] arr = new boolean[n + 2];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        for (int p = 2; p * p <= n; p++) {
            if (arr[p]) {
                for (int i = p * p; i <= n; i += p) {
                    arr[i] = false;
                }
            }
        }
        for (int p = 2; p <= n/2; p++) {
            if (arr[p] && arr[n-p]) {
                ans.add(Arrays.asList(p, n - p));
            }
        }
        return ans;
    }
}
