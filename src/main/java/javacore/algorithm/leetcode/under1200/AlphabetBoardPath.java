package javacore.algorithm.leetcode.under1200;

/**
 * 1138. Alphabet Board Path
 */
public class AlphabetBoardPath {
    public String alphabetBoardPath(String target) {
        int a = 0, b = 0;
        int x, y;
        StringBuilder sb = new StringBuilder();
        for (char c : target.toCharArray()) {
            x = (c - 'a') / 5;
            y = (c - 'a') % 5;
            while (x != a || y != b) {
                if (a > x) {
                    sb.append("U".repeat(Math.max(0, a - 1 - x + 1)));
                    a = x;
                } else if (a < x) {
                    int end = (b == 0) ? x : Math.min(x, 4);
                    sb.append("D".repeat(Math.max(0, end - (a + 1) + 1)));
                    a = end;
                }
                if (b > y) {
                    sb.append("L".repeat(Math.max(0, b - 1 - y + 1)));
                    b = y;
                } else if (b < y) {
                    sb.append("R".repeat(Math.max(0, Math.min(y, 4) - (b + 1) + 1)));
                    b = Math.min(y, 4);
                }
            }
            sb.append("!");
            a = x;
            b = y;
        }
        return sb.toString();
    }
}
