package javacore.algorithm.leetcode.under0100;

/*
 * LeetCode 54
 */
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
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
