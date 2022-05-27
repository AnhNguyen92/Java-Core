package javacore.algorithm.leetcode.under0100;

import java.util.Arrays;
import java.util.Comparator;

/*
 * LeetCode 56
 */
public class MergeIntervals {
	public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingDouble(a -> a[0]));
        int[][] mergeArr = new int[intervals.length][2];
        mergeArr[0] = intervals[0];
        int cur = 0;
        for (int i = 1; i < intervals.length; i++) {
            int[] temp = intervals[i];
            if (temp[0] > mergeArr[cur][1]) {
                mergeArr[++cur] = temp;
            } else {
                mergeArr[cur][0] = Math.min(mergeArr[cur][0], temp[0]);
                mergeArr[cur][1] = Math.max(mergeArr[cur][1], temp[1]);
            }
        }
        int[][] ans = new int[cur + 1][2];
        System.arraycopy(mergeArr, 0, ans, 0, cur + 1);
        return ans;
    }
}
