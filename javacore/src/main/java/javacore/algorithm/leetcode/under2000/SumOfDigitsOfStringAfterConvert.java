package javacore.algorithm.leetcode.under2000;

/*
 * LeetCode 1945
 */
public class SumOfDigitsOfStringAfterConvert {
	public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append((c - 'a') + 1);
        }
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum = 0;
            if (sb.length() == 1) {
                sum = Integer.parseInt(sb.toString());
                break;
            } else {
                for (int j = 0; j < sb.length(); j++) {
                    sum += sb.charAt(j) - '0';
                }
                sb = new StringBuilder();
                sb.append(sum);
                
            }
        }
        return sum;
    }
}
