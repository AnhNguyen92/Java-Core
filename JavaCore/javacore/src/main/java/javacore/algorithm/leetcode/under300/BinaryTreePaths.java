package javacore.algorithm.leetcode.under300;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * Leet code #257
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        addNode(ans, root, new StringBuilder(""));
        return ans;
    }
    
    private void addNode(List<String> ans, TreeNode root, StringBuilder sb) {
        if (root != null) {
            if (sb.length() != 0) {
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
