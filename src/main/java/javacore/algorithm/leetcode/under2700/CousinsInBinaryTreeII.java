package javacore.algorithm.leetcode.under2700;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 2641. Cousins in Binary Tree II
 */
public class CousinsInBinaryTreeII {
    List<Integer> levelSum = new ArrayList<>();

    public TreeNode replaceValueInTree(TreeNode root) {
        travel(root);
        resum(root, root.val, 0);
        return root;
    }

    private void resum(TreeNode current, int siblingSum, int level) {
        if (current != null) {
            current.val = levelSum.get(level) - siblingSum;
            int leftVal = (current.left != null) ? current.left.val : 0;
            int rightVal = (current.right != null) ? current.right.val : 0;
            resum(current.left, rightVal + leftVal, level + 1);
            resum(current.right, rightVal + leftVal, level + 1);
        }
    }

    private void travel(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            levelSum.add(sum);
        }
    }
}
