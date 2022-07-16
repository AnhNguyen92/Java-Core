package javacore.algorithm.leetcode.under0600;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.NodeList;

/*
 * LeetCode 590
 */
public class NaryTreePostorderTraversal {
	public List<Integer> postorder(NodeList root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        
        addNode(root, list);
        return list;
    }
    
    private void addNode(NodeList root, List<Integer> list) {
        if (root != null) {
            List<NodeList> children = root.children;
            if (children != null) {
                for (NodeList node : children) {
                    addNode(node, list);
                }
            }
            list.add(root.val);
        }
    }
}
