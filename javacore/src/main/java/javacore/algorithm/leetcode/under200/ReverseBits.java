package javacore.algorithm.leetcode.under200;

/*
 * LeetCode 190
 */
public class ReverseBits {
	public int reverseBits(int n) {
        String s = "" + n;
        String binary = String.format("%0"+ (32 - s.length() )+"d%s",0 , s);
        return Integer.parseInt(binary, 2);                     
    }
}
