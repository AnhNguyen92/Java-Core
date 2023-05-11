package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2570. Merge Two 2D Arrays by Summing Values
 */
public class MergeTwo2DArraysBySummingValues {
	public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int max = Math.max(nums1[nums1.length - 1][0], nums2[nums2.length - 1][0]);
        int[] tempArr = new int[max + 1];
        int count = 0;
        for (int[] arr : nums1) {
            tempArr[arr[0]] += arr[1];
        }
        for (int[] arr : nums2) {
            tempArr[arr[0]] += arr[1];
        }
        for (int i = 1; i <= max; i++) {
            if (tempArr[i] > 0) {
                count++;
            }
        }
        int j = 0;
        int[][] arr = new int[count][2];
        for (int i = 1; i <= max; i++) {
            if (tempArr[i] > 0) {
                arr[j][0] = i;
                arr[j++][1] = tempArr[i];
            }
        }
        return arr;
    }
}
