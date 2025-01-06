package javacore.algorithm.leetcode.under2400;

/**
 * 2381. Shifting Letters II
 */
public class ShiftingLettersII {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] arr = new int[s.length() + 1];
        for (int[] shift : shifts) {
            if (shift[2] == 0) {
                arr[shift[0]] += 25;
                arr[shift[1] + 1] -= 25;
            } else {
                arr[shift[0]]++;
                arr[shift[1] + 1]--;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i] = (arr[i] + arr[i-1]) % 26;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append( shift(s.charAt(i), arr[i] % 26) );
        }
        return sb.toString();
    }

    private char shift(char c, int shift) {
        return (char) ('a' + (c - 'a' + shift + 26 ) % 26);
    }
}
