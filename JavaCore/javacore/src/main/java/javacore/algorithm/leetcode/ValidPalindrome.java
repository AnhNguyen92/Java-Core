package javacore.algorithm.leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        StringBuilder str = new StringBuilder("");
        StringBuilder reverseStr = new StringBuilder("");
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isLetter(c) || Character.isDigit(c)) {
                str.append(Character.toLowerCase(c));
                reverseStr.insert(0, Character.toLowerCase(c));
            }
        }
        System.out.println(str);
        System.out.println(reverseStr);

        System.out.println(str.toString().equalsIgnoreCase(reverseStr.toString()));
    }
}
