package javacore.algorithm.leetcode.under1200;

public class ReverseSubstringsBetweenEachPairOfParentheses {
    public static void main(String[] args) {
        String ans = new ReverseSubstringsBetweenEachPairOfParentheses().reverseParentheses("(u(love)i)");
        System.out.println(ans);
    }

    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);
        int e = sb.indexOf(")");
        while (e > 0) {
            int f = e;
            while (sb.charAt(f) != '(') {
                f--;
            }

        }
        StringBuilder temp = new StringBuilder();
        char c;
        for (int i = s.length() - 1; i >= 0; i--) {
            c = s.charAt(i);
            if (c != '(' && c != ')') {
                temp.append(c);
            } else {
                sb.append(temp.toString().toLowerCase());
                temp = new StringBuilder();
            }
        }
        if (temp.length() > 0) {
            sb.append(temp.toString().toLowerCase());
        }
        return  sb.toString();
    }
}
