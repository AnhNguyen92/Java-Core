package javacore.algorithm.leetcode.under2200;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * LeetCode 2196. Create Binary Tree From Descriptions
 */
public class CreateBinaryTreeFromDescriptions {

    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, int[]> map = new HashMap<>();
        Set<Integer> parents = new HashSet<>();
        Set<Integer> children = new HashSet<>();
        for (int[] desc : descriptions) {
            if (map.containsKey(desc[0])) {
                int[] arr = map.get(desc[0]);
                arr[desc[2]] = desc[1];
            } else {
                int[] arr = new int[2];
                arr[desc[2]] = desc[1];
                map.put(desc[0], arr);
            }
            parents.add(desc[0]);
            children.add(desc[1]);
        }
        parents.removeAll(children);
        TreeNode ans = new TreeNode(parents.iterator().next());
        mapTree(ans, map);
        return ans;
    }

    private void mapTree(TreeNode root, Map<Integer, int[]> map) {
        if (root != null && map.containsKey(root.val)) {
            int[] arr = map.get(root.val);
            if (arr[1] > 0) {
                root.left = new TreeNode(arr[1]);
                mapTree(root.left, map);
            }
            if (arr[0] > 0) {
                root.right = new TreeNode(arr[0]);
                mapTree(root.right, map);
            }
        }
    }
}
