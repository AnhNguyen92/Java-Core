package javacore.algorithm.leetcode.under0600;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 538. Convert BST to Greater Tree
 */
public class ConvertBSTToGreaterTree {
	public TreeNode convertBST(TreeNode root) {
        List<TreeNode> lst = new ArrayList<>();
        travel(lst, root);
        for (int i = lst.size() - 2; i >= 0; i--) {
            TreeNode tree = lst.get(i);
            tree.val += lst.get(i + 1).val;
        }
        return root;
    }
    
    private void travel(List<TreeNode> lst, TreeNode root) {
        if (root != null) {
            travel(lst, root.left);
            lst.add(root);
            travel(lst, root.right);
        }
    }
    
    int sum = 0;
    public TreeNode convertBST1(TreeNode root) {
        if (root != null) {
            convertBST1(root.right);
            sum += root.val;
            root.val = sum;
            convertBST1(root.left);
        }
        return root;
    }
    
}
