package javacore.algorithm.leetcode.under0300;

import java.util.Arrays;

/*
 * LeetCode 274. H-Index
 */
public class HIndex {
	public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                return n - i;
            }
        }
        return 0;
    }
}
