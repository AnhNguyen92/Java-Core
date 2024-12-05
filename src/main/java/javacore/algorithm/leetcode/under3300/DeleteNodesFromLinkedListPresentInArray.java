package javacore.algorithm.leetcode.under3300;

import javacore.algorithm.leetcode.model.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 3217. Delete Nodes From Linked List Present in Array
 */
public class DeleteNodesFromLinkedListPresentInArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, true);
        }
        ListNode root =  new ListNode(0, head);
        ListNode current = root;
        while (current != null) {
            while (current.next != null && map.get(current.next.val) != null) {
                current.next = current.next.next;
            }
            current = current.next;
        }

        return root.next;
    }
}
