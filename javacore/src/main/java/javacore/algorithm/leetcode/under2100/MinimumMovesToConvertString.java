package javacore.algorithm.leetcode.under2100;

/*
 * LeetCode 2027. Minimum Moves to Convert String
 */
public class MinimumMovesToConvertString {
	public int minimumMoves(String s) {
		int move = 0;
		int len = s.length();
		s = s.replace("XXX", "");
		s = s.replace("OXX", "");
		s = s.replace("XXO", "");
		s = s.replace("XOX", "");
		move += (len - s.length()) / 3;
		len = s.length();
		s = s.replace("XX", "");
		move += (len - s.length()) / 2;
		len = s.length();
		s = s.replace("X", "");
		move += (len - s.length());

		return move;
	}
}
