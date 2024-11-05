package javacore.algorithm.leetcode.under3000;

import java.util.ArrayList;
import java.util.List;

/**
 * 2900. Longest Unequal Adjacent Groups Subsequence I
 */
public class LongestUnequalAdjacentGroupsSubsequenceI {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int[] arr = new int[groups.length];
        arr[0] = 1;
        List<String> lst = new ArrayList<>();
        lst.add(words[0]);
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1];
            if (groups[i] != groups[i-1]) {
                arr[i] += 1;
                lst.add(words[i]);
            }
        }
        return lst;
    }

}
