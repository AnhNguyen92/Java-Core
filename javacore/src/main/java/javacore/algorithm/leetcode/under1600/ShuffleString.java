package javacore.algorithm.leetcode.under1600;

/*
 * Leetcode 1528
 */

public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        char[] res = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
}
