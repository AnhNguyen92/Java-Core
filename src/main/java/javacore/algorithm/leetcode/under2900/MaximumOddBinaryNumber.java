package javacore.algorithm.leetcode.under2900;

/**
 * 2864. Maximum Odd Binary Number
 */
public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        boolean skip = false;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                if (skip) {
                    sb.insert(0, '1');
                } else {
                    skip = true;
                }
            } else {
                sb.append('0');
            }
        }
        return sb.append('1').toString();
    }
}
