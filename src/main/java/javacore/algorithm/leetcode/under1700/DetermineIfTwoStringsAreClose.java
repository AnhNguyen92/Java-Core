package javacore.algorithm.leetcode.under1700;

import java.util.*;

/*
 * LeetCode 1657. Determine if Two Strings Are Close
 */
public class DetermineIfTwoStringsAreClose {

    public boolean closeStrings(String word1, String word2) {
        int n = word1.length();
        if (n != word2.length()) {
            return false;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < n; i++) {
            arr1[word1.charAt(i) - 'a']++;
            arr2[word2.charAt(i) - 'a']++;
        }
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if ((arr1[i] > 0 && arr2[i] == 0) || (arr2[i] > 0 && arr1[i] == 0)) {
                return false;
            }
            if (arr1[i] > 0) {
                lst1.add(arr1[i]);
                lst2.add(arr2[i]);
            }
        }
        Collections.sort(lst1);
        Collections.sort(lst2);
        return lst1.equals(lst2);
    }
}
