package javacore.algorithm.leetcode.under0400;

/**
 * 334. Increasing Triplet Subsequence
 */
public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int one = Integer.MAX_VALUE;
        int two = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i < one) {
                one = i;
            } else if (i > one && i < two) {
                two = i;
            } else if (i > two)
                return true;
        }
        return false;
    }
}
