package javacore.algorithm.leetcode.under0600;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.NodeList;

/*
 * LeetCode 589. N-ary Tree Preorder Traversal
 */
public class NaryTreePreorderTraversal {
	public List<Integer> preorder(NodeList root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        
        addNode(root, list);
        return list;
    }
    
    private void addNode(NodeList root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            List<NodeList> children = root.children;
            if (children != null) {
                for (NodeList node : children) {
                    addNode(node, list);
                }
            }
            
        }
    }
}
