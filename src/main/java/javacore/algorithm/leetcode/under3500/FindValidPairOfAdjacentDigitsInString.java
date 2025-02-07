package javacore.algorithm.leetcode.under3500;

/**
 * 3438. Find Valid Pair of Adjacent Digits in String
 */
public class FindValidPairOfAdjacentDigitsInString {
    public String findValidPair(String s) {
        int[] arr = new int[10];
        for (char c : s.toCharArray()) {
            arr[c - '0']++;
        }
        char prev = s.charAt(0);
        int j, k;
        for (int i = 1; i <= s.length() - 1; i++) {
            char c = s.charAt(i);
            j = prev - '0';
            k = c - '0';
            if (prev != c && j == arr[j] && k == arr[k]) {
                return "" + prev + c;
            }
            prev = c;
        }
        return "";
    }
}
