package javacore.algorithm.leetcode.under0300;

/*
 * 227. Basic Calculator II
 */
public class BasicCalculatorII {
    public int calculate(String s) {
        int result = 0;
        int cur = 0;
        int last = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                cur = cur * 10 + c - '0';
            }
            if ((c < '0' || c > '9') && c != ' ' || i == s.length() - 1) {
                if (sign == '+' || sign == '-') {
                    result += last;
                    last = (sign == '+') ? cur : -cur;
                } else if (sign == '*') {
                    last *= cur;
                } else if (sign == '/') {
                    last /= cur;
                }
                cur = 0;
                sign = c;
            }
        }
        return result + last;
    }
}
