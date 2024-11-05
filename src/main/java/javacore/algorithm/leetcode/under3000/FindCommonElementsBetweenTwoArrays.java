package javacore.algorithm.leetcode.under3000;

/**
 * 2956. Find Common Elements Between Two Arrays
 */
public class FindCommonElementsBetweenTwoArrays {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2];
        int[] arr = new int[101];
        boolean count;
        for (int k : nums1) {
            count = false;
            for (int i : nums2) {
                if (k == i) {
                    if (!count) {
                        ans[0]++;
                        count = true;
                    }
                    if (arr[k] == 0) {
                        ans[1]++;
                    }
                }
            }
            arr[k] = 1;
        }
        return ans;
    }
}
