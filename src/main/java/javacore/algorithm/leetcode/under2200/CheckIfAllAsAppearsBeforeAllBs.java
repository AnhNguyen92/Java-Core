package javacore.algorithm.leetcode.under2200;

/*
 * LeetCode 2124. Check if All A's Appears Before All B's
 */
public class CheckIfAllAsAppearsBeforeAllBs {
	public boolean checkString(String s) {
        int aPos = s.lastIndexOf("a");
        int bPos = s.indexOf("b");
        return bPos == -1 || (aPos < bPos);
    }
}
