package javacore.algorithm.leetcode.under3500;

/**
 * 3407. Substring Matching Pattern
 */
public class SubstringMatchingPattern {
    public boolean hasMatch(String s, String p) {
        int i = p.indexOf("*");
        String p1 = p.substring(0, i);
        String p2 = p.substring(i+1);
        int idx = s.indexOf(p1);
        return idx >= 0 && idx + p1.length() <= s.lastIndexOf(p2);
    }
}
