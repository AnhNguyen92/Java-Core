package javacore.algorithm.leetcode.under3300;

/**
 * 3254. Find the Power of K-Size Subarrays I
 */
public class FindThePowerOfKSizeSubarraysI {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n - k + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i-1] > 0 && nums[i+k-1] == nums[i+k-2] + 1) {
                arr[i] = arr[i-1]+1;
            } else if (i + k > n) {
                arr[i] = -1;
            } else
                arr[i] = powerArr(nums, i , k);
        }
        return arr;
    }

    private int powerArr(int[] arr, int start , int k) {
        for (int i = start + 1; i < start + k; i++) {
            if (arr[i] - arr[i-1] != 1)
                return -1;
        }
        return arr[start + k - 1];
    }
}
