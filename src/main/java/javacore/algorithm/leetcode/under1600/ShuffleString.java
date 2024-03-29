package javacore.algorithm.leetcode.under1600;

/*
 * LeetCode 1528. Shuffle String
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
