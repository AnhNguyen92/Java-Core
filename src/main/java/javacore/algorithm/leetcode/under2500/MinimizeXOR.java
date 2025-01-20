package javacore.algorithm.leetcode.under2500;

/**
 * 2429. Minimize XOR
 */
public class MinimizeXOR {
    public int minimizeXor(int num1, int num2) {
        String s1 = Integer.toBinaryString(num1);
        String s2 = Integer.toBinaryString(num2);
        int cnt = Integer.bitCount(num2);

        int n = Math.max(s1.length(), s2.length());
        if (s1.length() < n) {
            s1 = "0".repeat(n - s1.length()) + s1;
        }
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == '1' && cnt > 0) {
                arr[i] = '1';
                cnt--;
            } else {
                arr[i] = '0';
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (cnt > 0 && arr[i] == '0') {
                arr[i] = '1';
                cnt--;
            }
        }
        return Integer.valueOf(new String(arr), 2);
    }
}
