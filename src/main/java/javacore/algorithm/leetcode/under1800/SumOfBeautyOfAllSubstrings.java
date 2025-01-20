package javacore.algorithm.leetcode.under1800;

import java.util.Arrays;

/**
 * 1781. Sum of Beauty of All Substrings
 */
public class SumOfBeautyOfAllSubstrings {
    public int beautySum(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        Arrays.sort(arr);
        int min = 0;
        for (int i = 0; i < 26; i++) {
            System.out.println(i + " " + arr[i]);
            if (arr[i] > 0) {
                min = arr[i];
                break;
            }
        }
        return arr[25] - min;
    }
}
