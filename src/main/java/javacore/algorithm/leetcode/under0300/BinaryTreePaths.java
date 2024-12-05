package javacore.algorithm.leetcode.under0300;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 257. Binary Tree Paths
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        addNode(ans, root, new StringBuilder());
        return ans;
    }
    
    private void addNode(List<String> ans, TreeNode root, StringBuilder sb) {
        if (root != null) {
            if (!sb.isEmpty()) {
                sb.append("->").append(root.val);
            } else {
                sb.append(root.val);
            }
            if (root.left == null && root.right == null) {
                ans.add(sb.toString());
            }
            addNode(ans, root.left, new StringBuilder(sb));
            addNode(ans, root.right, new StringBuilder(sb));
        }
        
    }
}
