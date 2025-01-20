package javacore.algorithm.leetcode.under0900;

/**
 * 848. Shifting Letters
 */
public class ShiftingLetters {
    public String shiftingLetters(String s, int[] shifts) {
        int t = 0;
        for (int i : shifts)
            t = (t + i) % 26;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shifts.length; i++) {
            sb.append((char) ('a' + (s.charAt(i) - 'a' + t) % 26));
            t = (t - shifts[i] % 26 + 26) % 26;
        }
        return sb.toString();
    }
}
