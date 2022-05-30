package javacore.algorithm.leetcode.under1400;

import java.util.Arrays;

/*
 * LeetCode 1385
 */
public class FindTheDistanceValueBetweenTwoArrays {
	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        boolean isSmaller = true;
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            isSmaller = true;
            
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    isSmaller = false;
                }
            }
            if (isSmaller)
                counter++;
            
        }
        return counter;
    }
}
