package javacore.algorithm.leetcode.under1800;

/*
 * Leetcode 1796
 */
public class SecondLargestDigitInAString {
	public int secondHighest(String s) {
        int[] arr = new int[10];
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int t = c - '0';
                arr[t] = 1;
            }
        }
        int count = 0;
        for (int i = 9; i >= 0; i--) {
            if (arr[i] > 0) {
                count++;
            }
            if (count == 2) {
                return i;
            }
        }
        return -1;
    }
}
