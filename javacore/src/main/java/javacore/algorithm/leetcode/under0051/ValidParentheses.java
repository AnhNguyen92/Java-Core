package javacore.algorithm.leetcode.under0051;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * LeetCode 20
 */

public class ValidParentheses {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidParentheses.class);
    
    public static void main(String[] args) {
        String s = "]";
        boolean isValid = true;
        StringBuilder builder = new StringBuilder("");
        int i = 0;
        while (i < s.length() && isValid) {
            char c = s.charAt(i);
            switch (c) {
            case '(':
                builder.append("(");
                break;
            case ')':
                if (builder.length() > 0 && builder.charAt(builder.length() - 1) == '(') {
                    builder.deleteCharAt(builder.length() - 1);
                } else {
                    isValid = false;
                }
                break;
            case '{':
                builder.append("{");
                break;
            case '}':
                if (builder.length() > 0 && builder.charAt(builder.length() - 1) == '{') {
                    builder.deleteCharAt(builder.length() - 1);
                } else {
                    isValid = false;
                }
                break;
            case '[':
                builder.append("[");
                break;
            case ']':
                if (builder.length() > 0 && builder.charAt(builder.length() - 1) == '[') {
                    builder.deleteCharAt(builder.length() - 1);
                } else {
                    isValid = false;
                }
                break;
            default:
                break;
            }
            i++;
        }
        LOGGER.info("{}", isValid && builder.toString().equals(""));
    }
}
