package javacore.algorithm.leetcode.under0300;

/**
 * 224. Basic Calculator
 */
public class BasicCalculator {
    public int calculate(String s) {
        s = s.replace(" ", "");
        int sum = 0;
        int prev = 0;
        char cal = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                int open = 1;
                int close = 0;
                int k = i + 1;
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == '(') {
                        open++;
                    } else if (s.charAt(j) == ')') {
                        close++;
                        if (close == open) {
                            k = j;
                            break;
                        }
                    }
                }
                sum = cal(sum, cal, calculate(s.substring(i + 1, k)));
                i = k;
            } else if (Character.isDigit(c)) {
                prev = prev * 10 + c - '0';
                if (i == s.length() - 1) {
                    sum = cal(sum, cal, prev);
                    prev = 0;
                }
            } else if (c == '+' || c == '-') {
                sum = cal(sum, cal, prev);
                prev = 0;
                cal = c;
            }
        }
        return sum;
    }

    private int cal(int a, char cal, int b) {
        if (cal == '+')
            return a + b;
        return a - b;
    }
}
