package javacore.algorithm.leetcode.under1500;

import java.util.Arrays;

/**
 * 1433. Check If a String Can Break Another String
 */
public class CheckIfAStringCanBreakAnotherString {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] arr = s1.toCharArray();
        char[] brr = s2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        int a = 1;
        int b = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > brr[i]) {
                a = 0;
            } else if (arr[i] < brr[i]) {
                b = 0;
            }
        }
        return a == 1 || b == 1;
    }
}
