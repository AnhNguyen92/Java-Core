package javacore.algorithm.leetcode.under500;

/*
 * LeetCode 434
*/
public class NumberSegmentsInString {
	public static void main(String[] args) {
		String s = ", , , ,        a, eaefa";
		String str = s.trim();
		if (str.equals("")) {
			System.out.println(0);
			return;
		}
		String[] arr = str.trim().split("\\s+");
		System.out.println(arr.length);
	}
}
