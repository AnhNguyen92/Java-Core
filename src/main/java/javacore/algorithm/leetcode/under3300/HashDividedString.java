package javacore.algorithm.leetcode.under3300;

/*
 * 3271. Hash Divided String
 */
public class HashDividedString {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - 'a';
            if ((i + 1) % k == 0) {
                sb.append((char) (sum % 26 + 97));
                sum = 0;
            }
        }
        return sb.toString();
    }
}
