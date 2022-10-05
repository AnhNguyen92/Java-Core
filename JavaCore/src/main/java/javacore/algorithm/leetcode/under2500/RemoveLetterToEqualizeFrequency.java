package javacore.algorithm.leetcode.under2500;

import java.util.Arrays;

/*
 * LeetCode 2423
 */
public class RemoveLetterToEqualizeFrequency {

    public boolean equalFrequency(String word) {
        int[] arr = new int[26];
        for (char c:
             word.toCharArray()) {
            arr[c - 'a']++;
        }
        Arrays.sort(arr);
        if (arr[25] == 1)
            return true;
        int i = 25;
        while (i > 0 && arr[i-1] > 0) {
            i--;
        }
        if (checkFrequencyArr(arr, 24, i , true)) {
            return true;
        }
        if (arr[i] > 1) {
            return false;
        }
        return checkFrequencyArr(arr, i + 1, 25, false);
    }

    public boolean checkFrequencyArr(int[] arr, int start, int end, boolean asc) {
        if (asc) {
            for (int i = start; i >= end; i--) {
                if (arr[i] != arr[25] - 1) {
                    return false;
                }
            }
        } else {
            for (int i = start; i <= end; i++) {
                if (arr[i] != arr[25]) {
                    return false;
                }
            }
        }

        return true;
    }
}
