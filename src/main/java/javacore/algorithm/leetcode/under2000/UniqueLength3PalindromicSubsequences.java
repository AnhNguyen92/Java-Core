package javacore.algorithm.leetcode.under2000;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1930. Unique Length-3 Palindromic Subsequences
 */
public class UniqueLength3PalindromicSubsequences {
    public int countPalindromicSubsequence(String s) {
        int[][] arr = new int[26][2];
        for (int[] ar : arr) {
            Arrays.fill(ar, 0, 2, -1);
        }

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (arr[idx][0] == -1) {
                arr[idx][0] = i;
            } else {
                arr[idx][1] = i;
            }
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i][1] > 0) {
                Set<Character> set = new HashSet<>();
                for (int j = arr[i][0] + 1; j < arr[i][1]; j++) {
                    set.add(s.charAt(j));
                }
                count += set.size();
            }
        }
        return count;
    }
}
