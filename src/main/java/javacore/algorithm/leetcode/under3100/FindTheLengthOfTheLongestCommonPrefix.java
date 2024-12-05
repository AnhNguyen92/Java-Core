package javacore.algorithm.leetcode.under3100;

import java.util.HashSet;
import java.util.Set;

/**
 * 3043. Find the Length of the Longest Common Prefix
 */
public class FindTheLengthOfTheLongestCommonPrefix {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set1 = getPrefixLst(arr1);
        Set<Integer> set2 = getPrefixLst(arr2);
        int max = 0;
        for (Integer i : set1) {
            if (set2.contains(i)) {
                max = Math.max(max, i);
            }
        }
        int count = 0;
        while (max > 0) {
            count++;
            max /= 10;
        }
        return count;
    }

    private Set<Integer> getPrefixLst(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            while (i > 0) {
                set.add(i);
                i /= 10;
            }
        }
        return set;
    }
}
