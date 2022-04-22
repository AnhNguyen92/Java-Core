package javacore.algorithm.leetcode;

/*
 * LeetCode 1431
*/
public class MinimumTimeToTypeWordUsingSpecialTypewriter {
	public int minTimeToType(String word) {
		int count = 0;
		char start = 'a';
		int temp;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			count++;
			temp = Math.abs(c - start);
			count += Math.min(temp, 26 - temp);
			start = c;
		}
		return count;
	}
}
