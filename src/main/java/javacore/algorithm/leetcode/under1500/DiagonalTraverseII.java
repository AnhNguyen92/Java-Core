package javacore.algorithm.leetcode.under1500;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1424. Diagonal Traverse II
 */
public class DiagonalTraverseII {
	public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<List<Integer>> sum = new ArrayList<>();
        int n = 0;
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> lst = nums.get(i);
            n += lst.size();
            for (int j = 0; j < lst.size(); j++) {
                if (i + j == sum.size()) {
                    sum.add(new ArrayList<>());
                }
                List<Integer> item = sum.get(i+j);
                item.add(0, lst.get(j));
            }
        }
        int[] arr = new int[n];
        int x = 0;
        for (int i = 0; i < sum.size(); i++) {
            List<Integer> lst = sum.get(i);
            for (int j = 0; j < lst.size(); j++) {
                arr[x++] = lst.get(j);
            }
        }
        return arr;
    }
}
