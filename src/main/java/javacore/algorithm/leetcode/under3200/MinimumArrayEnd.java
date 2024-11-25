package javacore.algorithm.leetcode.under3200;

/**
 * 3133. Minimum Array End
 */
public class MinimumArrayEnd {
    public long minEnd(int n, int x) {
        String s = String.format("%63s", Integer.toBinaryString(x)).replace(' ', '0');
        String s2 = Integer.toBinaryString(n-1);
        int idx = s2.length() - 1;
        long ans = 0;
        long pow = 1L;
        for (int i = 62; i >= 0; i--) {
            if (s.charAt(i) == '0' && idx >= 0) {
                ans += pow * (s2.charAt(idx--) - '0');
            } else {
                ans += pow * (s.charAt(i) - '0');
            }
            pow *= 2;
        }
        return ans;
    }
}
