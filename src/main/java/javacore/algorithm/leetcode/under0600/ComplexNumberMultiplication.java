package javacore.algorithm.leetcode.under0600;

/*
 * LeetCode 537. Complex Number Multiplication
 */
public class ComplexNumberMultiplication {
	public String complexNumberMultiply(String num1, String num2) {
		int[] nums1 = parseComplexStr(num1);
		int[] nums2 = parseComplexStr(num2);
		StringBuilder sb = new StringBuilder();
		sb.append(nums1[0] * nums2[0] - nums1[1] * nums2[1]).append('+')
				.append(nums2[0] * nums1[1] + nums1[0] * nums2[1]).append('i');
		return sb.toString();
	}

	private int[] parseComplexStr(String s) {
		int plusIdx = s.indexOf('+');
		int a = Integer.parseInt(s.substring(0, plusIdx));
		int b = Integer.parseInt(s.substring(plusIdx + 1, s.length() - 1));
		return new int[] { a, b };
	}
}
