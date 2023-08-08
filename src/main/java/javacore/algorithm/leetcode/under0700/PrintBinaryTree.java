package javacore.algorithm.leetcode.under0700;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;
/*
 * LeetCode 655. Print Binary Tree
 */
public class PrintBinaryTree {
	List<List<String>> lines;
    int height = 0;
    public List<List<String>> printTree(TreeNode root) {
        lines = new ArrayList<>();
        getHeight(root, 0);
        int n = (int) Math.pow(2, height) - 1;
        for (int i = 0; i < height; i++) {
            List<String> line = lines.get(i);
            for (int j = 0; j < n; j++) {
                line.add("");
            }
        }
        fill(root, 0, (n-1)/2);
        return lines;
    }
    private void fill(TreeNode root, int r, int c) {
        if (root != null) {
            List<String> line = lines.get(r);
            line.set(c, "" + root.val);
            fill(root.left, r + 1, c - (int) Math.pow (2, height - r - 2));
            fill(root.right, r + 1, c + (int) Math.pow(2, height - r - 2));
        }
    }

    private void getHeight(TreeNode root, int level) {
        if (root != null) {
            if (height == level) {
                lines.add(new ArrayList<>());
                height++;
            }
            getHeight(root.left, level + 1);
            getHeight(root.right, level + 1);
        }
    }
}
