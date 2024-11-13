package javacore.algorithm.leetcode.under1000;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 987. Vertical Order Traversal of a Binary Tree
 */
public class VerticalOrderTraversalOfABinaryTree {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        travel(map, root, 0, 0);
        List<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);
        List<List<Integer>> ans = new ArrayList<>();
        for (Integer key : sortedKeys) {
            List<int[]> value = map.get(key);
            value.sort((a, b) -> {
                int cmp = Integer.compare(a[0], b[0]);
                return (cmp != 0) ? cmp : Integer.compare(a[1], b[1]);
            });
            List<Integer> item = Arrays.stream(value.toArray(int[][]::new))
                    .map(arr -> arr[1])
                    .collect(Collectors.toList());

            ans.add(item);
        }

        return ans;
    }

    private void travel(Map<Integer, List<int[]>> map, TreeNode root, int row, int col) {
        if (root != null) {
            List<int[]> values = map.getOrDefault(col, new ArrayList<>());
            values.add(new int[]{row, root.val});
            map.put(col, values);
            if (root.left != null) {
                travel(map, root.left, row + 1, col - 1);
            }
            if (root.right != null) {
                travel(map, root.right, row + 1, col + 1);
            }
        }
    }
}
