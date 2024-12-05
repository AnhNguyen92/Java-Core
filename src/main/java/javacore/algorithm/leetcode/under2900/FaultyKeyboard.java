package javacore.algorithm.leetcode.under2900;

/**
 * 2810. Faulty Keyboard
 */
public class FaultyKeyboard {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != 'i')
                sb.append(c);
            else
                sb.reverse();
        }
        return sb.toString();
    }
}
