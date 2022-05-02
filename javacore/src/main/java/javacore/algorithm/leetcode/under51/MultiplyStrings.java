package javacore.algorithm.leetcode.under51;

/*
 * LeetCode 43
 */
public class MultiplyStrings {

	public String multiply(String num1, String num2) {
		int[] arr = new int[num1.length() + num2.length()];
		char c1;
		char c2;
		int n1;
		int n2;
		int temp = 0;
		int mul;
		int index;
		int n1last = num1.length() - 1;
		int n2last = num2.length() - 1;
		for (int i = n1last; i >= 0; i--) {
			c1 = num1.charAt(i);
			n1 = c1 - '0';
			for (int j = n2last; j >= 0; j--) {
				c2 = num2.charAt(j);
				n2 = c2 - '0';
				mul = n1 * n2;
				index = n1last - i + n2last - j;
				arr[index] += mul + temp;
				arr[index + 1] += arr[index] / 10;
				arr[index] %= 10;
			}

		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		while (sb.length() > 1 && sb.charAt(sb.length() - 1) == '0') {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.reverse().toString();
	}
}
