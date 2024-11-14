package javacore.algorithm.leetcode.under0400;

/**
 * 394. Decode String
 */
public class DecodeString {
    public String decodeString(String s) {
        int x = s.lastIndexOf("[");
        while (x != -1) {
            int y = s.indexOf("]", x + 1);
            int i = x - 1;
            while (i >= 0 && Character.isDigit(s.charAt(i))) {
                i--;
            }
            int n = Integer.parseInt(s.substring(i + 1, x));
            String str = s.substring(x + 1, y);
            s = s.replace(s.substring(i + 1, y + 1), str.repeat(n));
            x = s.lastIndexOf("[");
        }
        return s;
    }
}
