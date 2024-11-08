package javacore.algorithm.leetcode.under1700;

import java.util.Arrays;

/*
 * LeetCode 1657. Determine if Two Strings Are Close
 */
public class DetermineIfTwoStringsAreClose {

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;
        int[] arr = new int[26];
        int[] brr = new int[26];
        for (char c : word1.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            brr[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] + brr[i] > 0 && arr[i] * brr[i] == 0) {
                return false;
            }
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != brr[i]) {
                return false;
            }
        }
        return true;
    }
}
