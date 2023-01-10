package javacore.algorithm.leetcode.under1900;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1863. Sum of All Subset XOR Totals
 */
public class SumOfAllSubsetXORTotals {
	public int subsetXORSum(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> newItem;
        for (int i = 0; i < nums.length; i++) {
            int len = lst.size();
            for (int j = 0; j < len; j++) {
                List<Integer> item  = lst.get(j);
                newItem = new ArrayList<>();
                newItem.addAll(item);
                newItem.add(nums[i]);
                lst.add(newItem);
            }
            newItem = new ArrayList<>();
            newItem.add(nums[i]);
            lst.add(newItem);
        }
        int sum = 0;
        
        for (List<Integer> item : lst) {
            sum += sumXor(item);
        }
        return sum;
    }
    
    private int sumXor(List<Integer> lst) {
        int sum = 0;
        for (Integer i : lst) {
            sum ^= i;
        }
        return sum;
    }
}
