package javacore.algorithm.leetcode.under0600;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.Node1;

/*
 * LeetCode 589
 */
public class NaryTreePreorderTraversal {
	public List<Integer> preorder(Node1 root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        
        addNode(root, list);
        return list;
    }
    
    private void addNode(Node1 root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            List<Node1> children = root.children;
            if (children != null) {
                for (Node1 node : children) {
                    addNode(node, list);
                }
            }
            
        }
    }
}
