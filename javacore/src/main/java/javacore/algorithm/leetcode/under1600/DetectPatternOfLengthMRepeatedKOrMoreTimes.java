package javacore.algorithm.leetcode.under1600;

import java.util.Arrays;

/*
 * LeetCode 1566
 */
public class DetectPatternOfLengthMRepeatedKOrMoreTimes {
	public boolean containsPattern(int[] arr, int m, int k) {
        if (m * k > arr.length)
            return false;
        for (int i = 0; i <= arr.length - m * k; i++) {
            int count = 1;
            int[] arr1 = new int[m];
            System.arraycopy(arr, i, arr1, 0, m);
            for (int j = i + m; j <= arr.length - m; j+= m) {
                int[] arr2 = new int[m];
                System.arraycopy(arr, j, arr2, 0, m);
                if (Arrays.equals(arr1, arr2))
                    count++;
                else
                    break;
                if (count == k) {
                    return true;
                }
                    
            }
        }
        return false;
    }
}
