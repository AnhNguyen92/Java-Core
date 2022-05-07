package javacore.algorithm.leetcode.under0100;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		List<Integer> lst = spiralOrder(matrix);
		lst.forEach(item -> System.out.println(item));
	}
	
	public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst = new ArrayList<>();
        int left = 0;
        int up = 0;
        int right = matrix[0].length - 1;
        int down = matrix.length - 1;
        while (left <= right) {
            //top
            for (int j = left; j <= right; j++) {
                lst.add(matrix[up][j]);
            }
            up++;
            //right
            for (int i = up; i <= down; i++) {
                lst.add(matrix[i][right]);
            }
            right--;
            //down
            for (int j = right; j > left; j--) {
                lst.add(matrix[down][j]);
            }
            down--;
            //left
            for (int i = down; i >= up; i--) {
                lst.add(matrix[i][left]);
            }
            left++;
        }
        
        return lst;
    }
}
