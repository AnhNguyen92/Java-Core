package vn.com.ids.javacore.algorithm.leetcode.under51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        int[] uniqueNums = makeUnique(nums);
        Arrays.sort(uniqueNums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
    }

    public static int[] makeUnique(int[] values) {
        return Arrays.stream(values).distinct().toArray();
    }
    
    public void getTripSet(int[] nums) {
        for(int i = 0; i <= nums.length - 3; i++) {
            findDoubleSet(i+1, nums);
        }
    }
    
    public void findDoubleSet (int i, int[] nums) {
        for (int j = 0; j < nums.length; j++) {
            
        }
    }
}
