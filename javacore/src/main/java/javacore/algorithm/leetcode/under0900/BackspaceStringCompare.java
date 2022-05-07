package javacore.algorithm.leetcode.under0900;

/*
 * LeetCode 844
 */
public class BackspaceStringCompare {
	public boolean backspaceCompare(String S, String T) {
        StringBuilder sb = new StringBuilder(S);
        int i;
        while (sb.indexOf("#") > -1) {
            i = sb.indexOf("#");
            sb.deleteCharAt(i);
            if (i > 0) {
                sb.deleteCharAt(i-1);
            }
            
        }
        StringBuilder tb = new StringBuilder(T);
        while (tb.indexOf("#") > -1) {
            i = tb.indexOf("#");
            tb.deleteCharAt(i);
            if (i > 0) {
                tb.deleteCharAt(i-1);
            }
            
        }
        return sb.toString().equals(tb.toString());
    }
}
