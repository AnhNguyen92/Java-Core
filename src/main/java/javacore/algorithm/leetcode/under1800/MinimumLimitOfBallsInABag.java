package javacore.algorithm.leetcode.under1800;

import java.util.Arrays;

/**
 * 1760. Minimum Limit of Balls in a Bag
 */
public class MinimumLimitOfBallsInABag {
    public int minimumSize(int[] nums, int maxOperations) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 1;
        int r = nums[n - 1];
        int mid;
        while (r - l > 1) {
            mid = (r + l) / 2;
            int count = divide(nums, mid);
            if (count > maxOperations) l = mid;
            else r = mid;
        }
        return r;
    }

    private int divide(int[] arr, int n) {
        int ops = 0;
        for (int i = arr.length - 1; i>= 0; i--) {
            if (arr[i] <= n) break;
            ops += (int) Math.ceil(1.0 * arr[i] / n) - 1;
        }
        return ops;
    }
}
