package javacore.algorithm.leetcode.under2200;

/*
 * LeetCode 2124
 */
public class CheckIfAllAsAppearsBeforeAllBs {
	public boolean checkString(String s) {
        int aPos = s.lastIndexOf("a");
        int bPos = s.indexOf("b");
        return bPos == -1 || (aPos < bPos);
    }
}
