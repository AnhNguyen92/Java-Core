package javacore.algorithm.leetcode.under2500;

/*
 * Leetcode 2496. Maximum Value of a String in an Array
 */
public class MaximumValueOfAStringInAnArray {
	public int maximumValue(String[] strs) {
        int ans = 0;
        for (String str : strs) {
        	ans = Math.max(findValStr(str), ans);
        }
        return ans;
    }
	
	private int findValStr(String str) {
		int val = 0;
		for (char c : str.toCharArray()) {
			if (Character.isLetter(c)) {
				return str.length();
			}
			val = val * 10 + (c - '0');
		}
		return val;
	}
}
