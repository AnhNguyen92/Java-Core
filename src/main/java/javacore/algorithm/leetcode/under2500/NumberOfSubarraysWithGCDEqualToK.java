package javacore.algorithm.leetcode.under2500;

/**
 * 2447. Number of Subarrays With GCD Equal to K
 */
public class NumberOfSubarraysWithGCDEqualToK {
    public int subarrayGCD(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % k == 0) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % k == 0) {
                        if (gcdOfList(nums, i, j) == k) {
                            count++;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return count;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int gcdOfList(int[] numbers, int start, int end) {
        int result = numbers[start];
        for (int i = start + 1; i <= end; i++) {
            result = gcd(result, numbers[i]);
        }
        return result;
    }
}
