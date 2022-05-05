package javacore.algorithm.leetcode.under400;

/*
 * LeetCode 392
*/
public class IsSubsequence {
	public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (char c : s.toCharArray()) {
            int index = t.indexOf(c, i);
            if (index == -1) {
                return false;
            } else {
                i = index+1;
            }
                
        }
        return true;
    }
}
