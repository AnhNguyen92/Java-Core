package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 13. Roman to Integer
 */

public class RomanToInteger {
    public int romanToInt(String s) {
        int sum = charToInt(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            sum += charToInt(s.charAt(i));
            if ((s.charAt(i - 1) == 'I') && ((s.charAt(i) == 'V') || (s.charAt(i) == 'X'))) {
                sum -= 2;
            }
            if ((s.charAt(i - 1) == 'X') && ((s.charAt(i) == 'L') || (s.charAt(i) == 'C'))) {
                sum -= 20;
            }
            if ((s.charAt(i - 1) == 'C') && ((s.charAt(i) == 'D') || (s.charAt(i) == 'M'))) {
                sum -= 200;
            }
        }

        return sum;
    }

    private int charToInt(char c) {
        int result = 0;
        if (c == 'I') {
            result = 1;
        } else if (c == 'V') {
            result = 5;
        } else if (c == 'X') {
            result = 10;
        } else if (c == 'L') {
            result = 50;
        } else if (c == 'C') {
            result = 100;
        } else if (c == 'D') {
            result = 500;
        } else { // c == 'M'
            result = 1000;
        }

        return result;
    }

}
