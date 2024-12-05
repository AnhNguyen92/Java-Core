package javacore.algorithm.leetcode.under3200;

/**
 * 3162. Find the Number of Good Pairs I
 */
public class FindTheNumberOfGoodPairsI {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int sum = 0;
        for (int j : nums1) {
            for (int value : nums2) {
                if (j % (value * k) == 0) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
