package javacore.algorithm.leetcode.under0500;

/*
 * LeetCode 415. Add Strings
 */
public class AddStrings {
	public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int a;
        int b;
        int reminder = 0;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            a = (i >= 0) ? num1.charAt(i) - '0' : 0;
            b = (j >= 0) ? num2.charAt(j) - '0' : 0;
            sum = a + b + reminder;
            reminder = sum / 10;
            sb.append(sum % 10);
            i--;
            j--;
        }
        if (reminder > 0) {
            sb.append(reminder);
        }
        return sb.reverse().toString();
    }
}
