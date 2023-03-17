package javacore.algorithm.leetcode.under0200;

import java.util.HashMap;
import java.util.Map;

import javacore.algorithm.leetcode.model.linkedlist.Node;

/*
 * LeetCode 138. Copy List with Random Pointer
 */
public class CopyListWithRandomPointer {
	Map<Node, Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
         if (map.containsKey(head)) {
             return map.get(head);
         }
         Node copy = new Node(head.val);
         map.put(head, copy);
         copy.next = copyRandomList(head.next);
         copy.random = copyRandomList(head.random);
         
         return copy;
    }
}
