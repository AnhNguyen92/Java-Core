package javacore.algorithm.leetcode.under2000;

/*
 * LeetCode 1903
*/
public class LargestOddNumberInString {
	public String largestOddNumber(String num) {
        int i = num.length() - 1;
        while (i >= 0 && (num.charAt(i) - '0') % 2 == 0) {
            i--;
        }
        
        return i < 0 ? "" : num.substring(0, i + 1);
    }
}
