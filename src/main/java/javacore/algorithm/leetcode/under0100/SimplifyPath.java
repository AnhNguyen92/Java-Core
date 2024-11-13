package javacore.algorithm.leetcode.under0100;

import java.util.Stack;

/**
 * 71. Simplify Path
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");

        Stack<String> stack = new Stack<>();
        for (String s : paths) {
            if (s.equals(".")) {

            } else if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!s.isEmpty()) {
                stack.push(s);
            }
        }
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.insert(0, "/" + stack.pop());
        }
        if (sb.isEmpty()) {
            sb.append("/");
        }

        return sb.toString();
    }
}
