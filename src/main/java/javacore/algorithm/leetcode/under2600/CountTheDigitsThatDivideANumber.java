package javacore.algorithm.leetcode.under2600;
/*
 * LeetCode 2520. Count the Digits That Divide a Number
 */
public class CountTheDigitsThatDivideANumber {
	public int countDigits(int num) {
	       int n = num;
	       int ans = 0;
	       int i;
	       while (n > 0) {
	           i = n % 10;
	           if (num % i == 0) {
	               ans++;
	           }
	            n /= 10;
	       }
	       return ans; 
	    }
}
