package javacore.algorithm.leetcode.under1800;

/*
 * LeetCode 1784. Check if Binary String Has at Most One Segment of Ones
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
