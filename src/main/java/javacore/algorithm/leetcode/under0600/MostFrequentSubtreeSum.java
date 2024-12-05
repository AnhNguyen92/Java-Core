package javacore.algorithm.leetcode.under0600;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 508. Most Frequent Subtree Sum
 */
public class MostFrequentSubtreeSum {
    int max = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        sum(map, root);
        List<Integer> frequency = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                frequency.add(entry.getKey());
            }
        }
        return frequency.stream().mapToInt(i -> i).toArray();
    }

    private int sum(Map<Integer, Integer> map, TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = sum(map, root.left);
        int right = sum(map, root.right);
        int sum = root.val + left + right;
        map.merge(sum, 1, Integer::sum);
        max = Math.max(max, map.get(sum));
        return sum;
    }
}
