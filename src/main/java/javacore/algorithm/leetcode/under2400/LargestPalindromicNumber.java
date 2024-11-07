package javacore.algorithm.leetcode.under2400;

/**
 * 2384. Largest Palindromic Number
 */
public class LargestPalindromicNumber {
    public String largestPalindromic(String num) {
        int[] arr = new int[10];
        for (char c : num.toCharArray()) {
            arr[c - '0']++;
        }
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        boolean found = false;
        String mid = "";
        for (int i = 9; i >= 0; i--) {
            if (i > 0 || !left.isEmpty())
                for (int j = 1; j <= arr[i] / 2; j++) {
                    left.append(i);
                    right.append(i);
                }
            if (!found && arr[i] % 2 == 1) {
                mid = "" + i;
                found = true;
            }
        }

        left.append(mid).append(right.reverse());

        return (!left.isEmpty()) ? left.toString() : "0";
    }
}
