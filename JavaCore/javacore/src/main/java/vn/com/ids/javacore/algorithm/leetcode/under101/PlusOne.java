package vn.com.ids.javacore.algorithm.leetcode.under101;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 *  Leetcode #66
 */
public class PlusOne {
    private static final Logger logger = LoggerFactory.getLogger(PlusOne.class);
    public static void main(String[] args) {
        int[] digits = new int[] { 9 };
        int[] result = plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            logger.info("{}", result[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
        int[] arr = digits;
        int reminder = 1;
        int i = arr.length - 1;
        while (i >= 0 && reminder > 0) {
            int temp = arr[i] + reminder;
            arr[i] = temp % 10;
            reminder = temp / 10;
            i--;
        }
        if (reminder > 0) {
            int[] result = new int[arr.length + 1];
            result[0] = reminder;
            System.arraycopy(arr, 0, result, 1, result.length - 1);

            return result;
        }

        return arr;
    }

}
