package javacore.algorithm.leetcode.under1800;

/*
 * Leetcode 1784
 */
public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
	public boolean checkOnesSegment(String s) {
        int last = s.lastIndexOf("1");
        for (int i = 1; i <= last; i++) {
            if (s.charAt(i) == '0')
                return false;
        }
        return true;
    }
}
