package javacore.algorithm.leetcode.under1500;

/*
 * LeetCode . Maximum Score After Splitting a String
 */
public class MaximumScoreAfterSplittingAString {
	public int maxScore(String s) {
		int score = 0;
		int zeros = 0;
		int ones = 0;
		char[] crr = s.toCharArray();
		for (char c : crr) {
			if (c == '1')
				ones++;
		}
		for (int i = 0; i < crr.length - 1; i++) {
			char c = crr[i];
			if (c == '0')
				zeros++;
			else
				ones--;
			score = Math.max(score, zeros + ones);
		}

		return score;
	}
}
