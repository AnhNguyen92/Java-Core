package javacore.algorithm.leetcode.under3100;

/**
 * 3046. Split the Array
 */
public class SplitTheArray {
    public boolean isPossibleToSplit(int[] nums) {
        int[] arr = new int[101];
        for (int i : nums) {
            arr[i]++;
            if (arr[i] > 2) {
                return false;
            }
        }
        return true;
    }
}
