package javacore.algorithm.leetcode.under1700;

/**
 * 1664. Ways to Make a Fair Array
 */
public class WaysToMakeAFairArray {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        for (int i = 0; i < n; i++) {
            prefixSum[i] += nums[i];
            if (i > 1)
                prefixSum[i] += prefixSum[i-2];
        }
        for (int i = n - 1; i >= 0; i--) {
            suffixSum[i] += nums[i];
            if (i < n - 2)
                suffixSum[i] += suffixSum[i+2];
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int firstSide = 0;
            int secondSide = 0;
            if (i % 2 == 0) {
                if (i > 0) {
                    firstSide += prefixSum[i-2];
                    secondSide += prefixSum[i-1];
                }
                if (i + 2 < n)
                    secondSide += suffixSum[i+2];
                if (i + 1 < n)
                    firstSide += suffixSum[i+1];
            } else {
                firstSide += prefixSum[i-1];
                if (i > 1) {
                    secondSide += prefixSum[i-2];
                }
                if (i + 1 < n) {
                    secondSide += suffixSum[i+1];
                }
                if (i + 2 < n)
                    firstSide += suffixSum[i+2];
            }
            if (firstSide == secondSide)
                count++;
        }
        return count;
    }
}
