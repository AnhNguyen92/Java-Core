package javacore.algorithm.leetcode.under1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1110
 */
public class DeleteNodesAndReturnForest {
	public List<TreeNode> delNodes(TreeNode root, int[] toDelete) {
        List<TreeNode> ans = new ArrayList<>();
        Arrays.sort(toDelete);
        for (int i = toDelete.length - 1; i >= 0; i--)
            root = travel(ans, root, toDelete[i]);
        if (root != null)
            ans.add(root);
        return ans;
    }
    
    private TreeNode travel(List<TreeNode> ans, TreeNode root, int i) {
        if (root != null) {
            if (root.val < i) {
                root.left = travel(ans, root.left, i);
                root.right = travel(ans, root.right, i);
            } else if (root.val == i) {
                if (root.left != null)
                    ans.add(root.left);
                if (root.right != null)
                    ans.add(root.right);
                root = null;
            }
        }
        return root;
    }
}
