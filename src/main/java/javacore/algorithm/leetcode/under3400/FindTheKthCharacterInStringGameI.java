package javacore.algorithm.leetcode.under3400;

/*
 * LeetCode 3304. Find the K-th Character in String Game I
 */
public class FindTheKthCharacterInStringGameI {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        int count = 1;
        while (count < k) {
            int n = sb.length();
            for (int i = 0; i < n; i++) {
                char c = (char) (sb.charAt(i) + 1);
                count++;
                sb.append(c);
            }
        }
        return sb.charAt(k-1);
    }
}
