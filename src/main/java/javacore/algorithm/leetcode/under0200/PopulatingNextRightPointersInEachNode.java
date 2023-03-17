package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.Node;

/*
 * LeetCode 116. Populating Next Right Pointers in Each Node
 */
public class PopulatingNextRightPointersInEachNode {
	public Node connect(Node root) {
        List<List<Node>> lst = new ArrayList<>();
        travel(lst, root, 0);
        return root;
    }
    
    private void travel(List<List<Node>> lst, Node root, int height) {
        if (root != null) {
            if (height < lst.size()) {
                List<Node> item = lst.get(height);
                root.next = item.get(0);
                item.add(0, root);
            }
            else {
                root.next = null;
                List<Node> item = new ArrayList<>();
                item.add(root);
                lst.add(item);
            }
            travel(lst, root.right, height+1);
            travel(lst, root.left, height+1);
        }
    }
}
