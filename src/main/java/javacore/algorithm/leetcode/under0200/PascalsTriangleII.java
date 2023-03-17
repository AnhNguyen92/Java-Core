package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 119. Pascal's Triangle II
 */
public class PascalsTriangleII {
	public List<Integer> getRow(int rowIndex) {
        int [][] pascal = new int [rowIndex+1][rowIndex+1];
        pascal[0][0]=1;
        for (int i = 1; i <= rowIndex; i++){
            pascal[i][0]=1;
            pascal[i][rowIndex]=1;
        }
        for (int i = 1;i <= rowIndex; i++){
            for(int j=1; j < rowIndex; j++){
                pascal[i][j]= pascal[i-1][j-1]+pascal[i-1][j];
            }
        }
        List<Integer>answer = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            answer.add(pascal[rowIndex][i]);
        }
        
        return answer;
    }
}
