package javacore.algorithm.leetcode.under2300;

/*
 * LeetCode 2220
 */
public class MinimumBitFlipsToConvertNumber {
	public int minBitFlips(int start, int goal) {
        int no = start ^ goal;
        String s = Integer.toBinaryString(no);
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}
