package javacore.algorithm.leetcode.under1600;

/**
 * 1545. Find Kth Bit in Nth Binary String
 */
public class FindKthBitInNthBinaryString {
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder("0");
        for (int i = 2; i <= n; i++) {
            int len = sb.length() - 1;
            sb.append("1");
            for (int j = len; j >= 0; j--) {
                sb.append(sb.charAt(j) == '1' ? '0' : '1');
            }
            if (k <= sb.length()) return sb.charAt(k - 1);
        }
        return sb.charAt(k - 1);
    }

}
