package javacore.algorithm.leetcode.under2400;

/**
 * 2375. Construct Smallest Number From DI String
 */
public class ConstructSmallestNumberFromDIString {
    public String smallestNumber(String pattern) {
        int[] arr = new int[pattern.length()+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        boolean valid = false;
        while (!valid) {
            valid = true;
            for (int i = 0; i < pattern.length(); i++) {
                if (pattern.charAt(i) == 'I' && arr[i] > arr[i+1]) {
                    valid = false;
                    int a = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = a;
                } else if (pattern.charAt(i) == 'D' && arr[i] < arr[i+1]) {
                    valid = false;
                    int a = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = a;
                }
            }
        }
        int s = 0;
        for (int j : arr) {
            s = s * 10 + j;
        }
        return s + "";
    }
}
