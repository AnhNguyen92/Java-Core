package javacore.algorithm.leetcode.under0051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * LeetCode 40. Combination Sum II
 */
public class CombinationSumII {
	int temp;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        sum(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }
    
    public void sum(List<List<Integer>> ans, List<Integer> item, int[] candidates, int target, int index) {
        if (target > 0) {
            temp = -1;
            for (int i = index; i < candidates.length; i++) {
                if (candidates[i] == temp)
                    continue;
                item.add(candidates[i]);
                sum(ans, item, candidates, target - candidates[i], i+1);
                temp = item.remove(item.size() - 1);
            }
        }
        if (target == 0) {
            ans.add(new ArrayList<>(item));
        }
    }
}
