package javacore.algorithm.leetcode.under3200;

/**
 * 3131. Find the Integer Added to Array I
 */
public class FindTheIntegerAddedToArrayI {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1 = findMin(nums1);
        int min2 = findMin(nums2);
        return min2 - min1;
    }

    private int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
