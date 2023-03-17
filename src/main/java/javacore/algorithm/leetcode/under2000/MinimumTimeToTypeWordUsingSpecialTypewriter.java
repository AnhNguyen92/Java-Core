package javacore.algorithm.leetcode.under2000;

/*
 * LeetCode 1974. Minimum Time to Type Word Using Special Typewriter
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
