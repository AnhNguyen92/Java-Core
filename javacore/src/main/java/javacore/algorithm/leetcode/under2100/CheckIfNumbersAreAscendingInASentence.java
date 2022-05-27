package javacore.algorithm.leetcode.under2100;

/*
 * Leetcode 2042
 */
public class CheckIfNumbersAreAscendingInASentence {
	public boolean areNumbersAscending(String s) {
        String[] st = s.split(" ");
        int n = 0;
        int prev = -1;
        char c;
        for (String item : st) {
            c = item.charAt(0);
            if (c <= '9' && c >= '0') {
                n = Integer.parseInt(item);
                if (prev >= n) {
                    return false;
                }
                prev = n;
            }
        }
        return true;
    }
}
