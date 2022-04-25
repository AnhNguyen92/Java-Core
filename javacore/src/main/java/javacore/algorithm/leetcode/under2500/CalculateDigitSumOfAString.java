package javacore.algorithm.leetcode.under2500;

/*
 * LeetCode 2243
*/
public class CalculateDigitSumOfAString {
	public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i += k) {
                String str = s.substring(i, Math.min(i + k, s.length()));
                sb.append(calculate(str));
            }
            s = sb.toString();
        }
        return s;
    }
    
    private int calculate(String num) {
        int sum = 0;
        for (char c : num.toCharArray())
            sum += c - '0';
        return sum;
    }
}
