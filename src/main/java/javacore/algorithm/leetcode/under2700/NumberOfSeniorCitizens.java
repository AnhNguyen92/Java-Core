package javacore.algorithm.leetcode.under2700;

/*
 * LeetCode 2678. Number of Senior Citizens
 */
public class NumberOfSeniorCitizens {
	public int countSeniors(String[] details) {
		int count = 0;
		int age;
		for (String s : details) {
			age = (s.charAt(11) - '0') * 10 + (s.charAt(12) - '0');
			count += age > 60 ? 1 : 0;
		}
		return count;
	}
}
