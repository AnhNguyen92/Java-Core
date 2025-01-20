package javacore.algorithm.leetcode.under2500;

/**
 * 2425. Bitwise XOR of All Pairings
 */
public class BitwiseXOROfAllPairings {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m % 2 == 0) {
            if(n % 2 == 0)
                return 0;
            return xor(nums1);
        } else if (n % 2 == 0) {
            return xor(nums2);
        }

        return xor(nums1) ^ xor(nums2);
    }

    private int xor(int[] arr) {
        int s = 0;
        for (int x : arr)
            s ^= x;
        return s;
    }
}
