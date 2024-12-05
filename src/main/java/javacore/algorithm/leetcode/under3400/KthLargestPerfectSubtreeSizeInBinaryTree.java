package javacore.algorithm.leetcode.under3400;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* LeetCode 3319. K-th Largest Perfect Subtree Size in Binary Tree
* */
public class KthLargestPerfectSubtreeSizeInBinaryTree {
    List<Integer> lst = new ArrayList<>();

    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        perfectBinaryTree(root);
        if (k > lst.size()) {
            return -1;
        }
        Collections.sort(lst, Collections.reverseOrder());
        return lst.get(k - 1);
    }

    private int perfectBinaryTree(TreeNode root) {
        int ans = -1;
        if (root != null) {
            if (root.left == null & root.right == null) {
                ans = 1;
                lst.add(1);
            } else {
                int leftSize = perfectBinaryTree(root.left);
                int rightSize = perfectBinaryTree(root.right);
                if (leftSize == rightSize && leftSize >= 0) {
                    ans = leftSize + 1 + rightSize;
                    lst.add(ans);
                }
            }
        }
        return ans;
    }
}
