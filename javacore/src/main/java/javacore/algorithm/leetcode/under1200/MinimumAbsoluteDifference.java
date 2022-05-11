package javacore.algorithm.leetcode.under1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * LeetCode 1200
 */
public class MinimumAbsoluteDifference {
	public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int min = arr[1] - arr[0];
        for (int i = 2; i <= arr.length - 1; i++) {
            if (min > (arr[i] - arr[i-1]) ) {
                min = arr[i] - arr[i-1];
            }
        }
        for (int i = 1; i <= arr.length - 1; i++) {
            if (min == (arr[i] - arr[i-1]) ) {
                res.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return res;
    }
}
