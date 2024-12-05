package javacore.algorithm.leetcode.under1600;

/*
 * 1513. Number of Substrings With Only 1s
 */
public class NumberOfSubstringsWithOnly1s {
    public int numSub(String s) {
        int count = 0;
        long ans = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
                ans += count;
            } else {
                count = 0;
            }
        }
        return (int) (ans % 1000000007);
    }
}
