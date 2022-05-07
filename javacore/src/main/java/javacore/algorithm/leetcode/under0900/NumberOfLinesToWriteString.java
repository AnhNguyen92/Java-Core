package javacore.algorithm.leetcode.under0900;

/*
 * LeetCode 806
 */
public class NumberOfLinesToWriteString {
	public int[] numberOfLines(int[] widths, String s) {
        int sum = 0;
        int lines = 1;
        for (char c : s.toCharArray()) {
            int val = widths[c - 'a'];
            if (sum + val > 100) {
                lines++;
                sum = 0;
            }
            sum += val;
        }
        
        return new int[] { lines, sum };
    }
}
