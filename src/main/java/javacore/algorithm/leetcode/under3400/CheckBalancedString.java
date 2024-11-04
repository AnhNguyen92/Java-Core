package javacore.algorithm.leetcode.under3400;

/*
 * LeetCode 3340. Check Balanced String
 */
public class CheckBalancedString {
    public boolean isBalanced(String num) {
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += (i % 2 == 0) ? (num.charAt(i) - '0') : ('0' - num.charAt(i));
        }
        return sum == 0;
    }
}
