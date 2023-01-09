package javacore.algorithm.leetcode.under1100;

/*
 * LeetCode 1051. Height Checker
 */
public class HeightChecker {
	public int heightChecker(int[] heights) {
        int counter = 0;
        int[] arr = new int[101];
        for(int i = 0; i < heights.length; i++) {
            arr[heights[i]] += 1;
        }
        int i = 0;
        for(int ii = 0; ii < arr.length; ii++) {
            if (arr[ii] != 0) {
                int repetitions = arr[ii];
                for(int j = 0;j < repetitions; j++) {
                    if(heights[i] != ii) {
                        counter ++;
                    }
                    i++;
                }
            }
        }
        return counter;
    }
}
