package javacore.algorithm.leetcode.under3300;

/**
 * 3210. Find the Encrypted String
 */
public class FindTheEncryptedString {
    public String getEncryptedString(String s, int k) {
        k = k % s.length();
        if (k == 0) return s;
        return s.substring(k) + s.substring(0, k);
    }
}
