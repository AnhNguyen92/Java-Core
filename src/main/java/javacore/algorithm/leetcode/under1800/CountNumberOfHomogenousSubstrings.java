package javacore.algorithm.leetcode.under1800;

/**
 * 1759. Count Number of Homogenous Substrings
 */
public class CountNumberOfHomogenousSubstrings {
    public int countHomogenous(String s) {
        int count = 0;
        char prev = '\u0000';
        int modulo = 1_000_000_007;
        int ans = 0;

        for (char c : s.toCharArray()) {
            if (c == prev) {
                count++;
            } else {
                count = 1;
                prev = c;
            }
            ans = (ans + count) % modulo;
        }

        return ans;
    }
}
