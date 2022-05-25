package javacore.algorithm.leetcode.under0600;

/*
 * Leetcode 521
 */
public class LongestUncommonSubsequenceI {
	public int findLUSlength(String a, String b) {
        if (a.equals(b))
            return -1;
        
        return Math.max(a.length(), b.length());
    }
}
