package javacore.algorithm.leetcode.under1100;

/**
 * 1016. Binary String With Substrings Representing 1 To N
 */
public class BinaryStringWithSubstringsRepresenting1ToN {
    public boolean queryString(String s, int n) {
        for (int i = 1; i <= n; i++) {
            if (!s.contains(Integer.toBinaryString(i)))
                return false;
        }
        return true;
    }
}
