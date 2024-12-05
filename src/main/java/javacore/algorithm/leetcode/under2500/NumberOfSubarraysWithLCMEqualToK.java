package javacore.algorithm.leetcode.under2500;

/**
 * 2470. Number of Subarrays With LCM Equal to K
 */
public class NumberOfSubarraysWithLCMEqualToK {
    public int subarrayLCM(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int lcm = nums[i];
            for (int j = i; j < nums.length; j++) {
                lcm = lcm(nums[j], lcm);
                if (lcm == k) {
                    count++;
                } else if (lcm > k) {
                    break;
                }
            }
        }
        return count;
    }

    public int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
