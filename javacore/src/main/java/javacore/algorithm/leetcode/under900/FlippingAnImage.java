package javacore.algorithm.leetcode.under900;

/*
 * LeetCode 832
 */
public class FlippingAnImage {
	public int[][] flipAndInvertImage(int[][] arr) {
        int col = arr[0].length;
        int mid = col/2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < mid; j++) {
                int temp = arr[i][col-1-j];
                arr[i][col-1 -j] = arr[i][j];
                arr[i][j] =temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1 - arr[i][j];
            }
        }
        return arr;
    }
}
