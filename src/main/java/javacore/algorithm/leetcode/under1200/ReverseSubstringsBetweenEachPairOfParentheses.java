package javacore.algorithm.leetcode.under1200;

/*
 * LeetCode 1190. Reverse Substrings Between Each Pair of Parentheses
 */
public class ReverseSubstringsBetweenEachPairOfParentheses {
	public String reverseParentheses(String s) {
        int x = s.lastIndexOf("(");
        int y;
        String str;
        while (x >= 0) {
            y = s.indexOf(")", x);
            str = s.substring(x+1, y);
            s = s.replace("(" + str + ")", new StringBuilder(str).reverse().toString());
            x = s.lastIndexOf("(");
        }
        return s;
    }
}
