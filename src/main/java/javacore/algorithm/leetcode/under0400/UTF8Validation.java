package javacore.algorithm.leetcode.under0400;
/*
 * 393. UTF-8 Validation
 */
public class UTF8Validation {
    //TODO
    public boolean validUtf8(int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= 248) {
                return false;
            }
            String s = Integer.toBinaryString(data[i]);
            if (s.startsWith("01")) {

            }
        }

        return true;
    }
}
