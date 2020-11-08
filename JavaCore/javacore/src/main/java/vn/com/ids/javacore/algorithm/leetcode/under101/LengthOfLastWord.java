package vn.com.ids.javacore.algorithm.leetcode.under101;

/*
 * Leet code #58
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = " a ";

        System.out.println(s.trim());
//        String s = "Hello ";
        int lastIndex = s.lastIndexOf(" ");
        if (lastIndex == s.length() - 1) {
            System.out.println(s.length() - 1);
        }
        System.out.println(s.length() - 1 - lastIndex);
    }
}
