package javacore.algorithm.leetcode.under0100;

/*
 *  LeetCode 66. Plus One
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
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
