package javacore.algorithm.leetcode.under0100;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 78. Subsets
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        while (i <= nums.length - 1) {
            int num = nums[i];
            List<List<Integer>> tempLst = new ArrayList<>();
            for (int j = 0; j < ans.size(); j++) {
                tempLst.add(new ArrayList<>(ans.get(j)) );
              }
            for (int j = ans.size() - 1; j >= 0; j--) {
                List<Integer> temp = tempLst.get(j);
                temp.add(num);
            }
            List<Integer> newItem = new ArrayList<>();
            newItem.add(num);
            tempLst.add(newItem);
            ans.addAll(tempLst);
            i++;
        }

        ans.add(new ArrayList<>());
        return ans;
    }
}
