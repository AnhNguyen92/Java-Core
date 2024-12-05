package javacore.algorithm.leetcode.under2200;

import java.util.Arrays;

/*
 * 2165. Smallest Value of the Rearranged Number
 */
public class SmallestValueOfTheRearrangedNumber {
    public long smallestNumber(long num) {
        String str = "" + num;
        char[] crr = str.toCharArray();
        long number = 0L;
        if (num >= 0) {
            Arrays.sort(crr);
            if (crr[0] == '0') {
                for (int i = 1; i < crr.length; i++) {
                    if (crr[i] - '0' > 0) {
                        crr[0] = crr[i];
                        crr[i] = '0';
                        break;
                    }
                }
            }
            for (char c : crr) {
                number = number * 10 + (c - '0');
            }
        } else {
            for (int i = 1; i < crr.length; i++) {
                for (int j = i+1; j < crr.length; j++) {
                    if (crr[j] - crr[i] > 0) {
                        char temp = crr[j];
                        crr[j] = crr[i];
                        crr[i] = temp;
                    }
                }
            }
            for (int i = 1; i < crr.length; i++) {
                number = number * 10 + (crr[i] - '0');
            }
            number *= -1;
        }

        return number;
    }
}
