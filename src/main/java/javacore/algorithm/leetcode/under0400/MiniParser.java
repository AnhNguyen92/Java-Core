package javacore.algorithm.leetcode.under0400;

/**
 * 385. Mini Parser
 */
public class MiniParser {
    /**
     * // This is the interface that allows for creating nested lists.
     * // You should not implement it, or speculate about its implementation
     * public interface NestedInteger {
     *     // Constructor initializes an empty nested list.
     *     public NestedInteger();
     *
     *     // Constructor initializes a single integer.
     *     public NestedInteger(int value);
     *
     *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
     *     public boolean isInteger();
     *
     *     // @return the single integer that this NestedInteger holds, if it holds a single integer
     *     // Return null if this NestedInteger holds a nested list
     *     public Integer getInteger();
     *
     *     // Set this NestedInteger to hold a single integer.
     *     public void setInteger(int value);
     *
     *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
     *     public void add(NestedInteger ni);
     *
     *     // @return the nested list that this NestedInteger holds, if it holds a nested list
     *     // Return empty list if this NestedInteger holds a single integer
     *     public List<NestedInteger> getList();
     * }
     */

      // the solution is commented base on we don't have class NestedInteger implement

//    public NestedInteger deserialize(String s) {
//        NestedInteger root = new NestedInteger();
//        if (s.charAt(0) != '[') {
//            root.setInteger(Integer.parseInt(s));
//            return root;
//        }
//        Stack<NestedInteger> stack = new Stack<>();
//        stack.push(root);
//        int x = 0;
//        boolean sign = true;
//        for (int i = 1; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == '[') {
//                NestedInteger child = new NestedInteger();
//                stack.peek().add(child);
//                stack.push(child);
//            } else {
//                boolean digit = Character.isDigit(s.charAt(i - 1));
//                if (c == ']') {
//                    if (digit) {
//                        NestedInteger child = stack.peek();
//                        if (!sign) {
//                            x *= -1;
//                        }
//                        child.add(new NestedInteger(x));
//                    }
//                    x = 0;
//                    sign = true;
//                    if (i < s.length() - 1)
//                        stack.pop();
//                } else if (c == ',') {
//                    if (digit) {
//                        if (!sign) {
//                            x *= -1;
//                        }
//                        stack.peek().add(new NestedInteger(x));
//                        x = 0;
//                    }
//                    sign = true;
//                } else if (c == '-') {
//                    sign = false;
//                } else {
//                    x = x * 10 + c - '0';
//                    if (i == s.length() - 1) {
//                        if (!sign) {
//                            x *= -1;
//                        }
//                        stack.peek().setInteger(x);
//                    }
//                }
//            }
//        }
//        return root;
//    }
}
