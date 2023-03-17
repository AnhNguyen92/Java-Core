package javacore.algorithm.leetcode.under1100;

/*
 * LeetCode 1030. Matrix Cells in Distance Order
 */
public class MatrixCellsInDistanceOrder {
	public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] arr = new int[rows * cols][2];
		int[][] distance = new int[rows][cols];
        int k = 0;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            	distance[i][j] = Math.abs(rCenter - i) + Math.abs(cCenter - j);
            }
        }
        while (k < arr.length) {
	      for (int i = 0; i < rows; i++) {
	          for (int j = 0; j < cols; j++) {
	        	  if (distance[i][j] == count) {	        		  
	        		  arr[k][0] = i;
	        		  arr[k][1] = j;
	        		  k++;
	        	  }
	          }
	      }
	      count++;
        }
        
        return arr;
    }
}
