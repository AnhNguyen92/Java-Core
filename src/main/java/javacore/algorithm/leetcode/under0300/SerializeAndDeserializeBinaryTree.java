package javacore.algorithm.leetcode.under0300;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/*
* LeetCode 297. Serialize and Deserialize Binary Tree
**/
public class SerializeAndDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)   return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                var curr = queue.poll();
                if (curr == null) {
                    sb.append(",null");
                } else {
                    if (sb.length() > 0)
                        sb.append(",");
                    sb.append(curr.val);
                    queue.offer(curr.left);
                    queue.offer(curr.right);
                }
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if ("".equals(data))    return null;
        String[] arr = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        for (int i = 1; i < arr.length; i += 2) {
            var curr = queue.poll();
            if (!"null".equals(arr[i])) {
                curr.left = new TreeNode(Integer.parseInt(arr[i]));
                queue.offer(curr.left);
            }
            if (i + 1 < arr.length) {
                if (!"null".equals(arr[i+1])) {
                    curr.right = new TreeNode(Integer.parseInt(arr[i+1]));
                    queue.offer(curr.right);
                }
            }
        }
        return root;
    }
}
