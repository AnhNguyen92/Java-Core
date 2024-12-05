package javacore.algorithm.leetcode.under3300;

/**
 * 3226. Number of Bit Changes to Make Two Integers Equal
 */
public class NumberOfBitChangesToMakeTwoIntegersEqual {
    public int minChanges(int n, int k) {
        String s1 = Integer.toBinaryString(n);
        String s2 = Integer.toBinaryString(k);
        int x = s1.length() - 1;
        int y = s2.length() - 1;
        char c1, c2;
        int count = 0;
        for (; x >= 0 || y >= 0; x--, y--) {
            c1 = (x >= 0) ? s1.charAt(x) : '0';
            c2 = (y >= 0) ? s2.charAt(y) : '0';
            if (c1 == '0') {
                if (c2 == '1') return -1;
            } else {
                if (c2 == '0') count++;
            }
        }
        return count;
    }
}
