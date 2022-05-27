package javacore.algorithm.leetcode.under1800;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 1721
 */
public class SwappingNodesInALinkedList {
	public ListNode swapNodes(ListNode head, int k) {
        List<Integer> lst = new ArrayList<>();
        addList(lst, head);
        swap(lst, k);
        ListNode ans = null;
        for (int i = lst.size() - 1; i >= 0; i--) {
            ans = new ListNode(lst.get(i), ans);
        }
        return ans;
    }
    
    private void addList(List<Integer> lst, ListNode head) {
        if (head != null) {
            lst.add(head.val);
            addList(lst, head.next);
        }
    }
    
    private void swap(List<Integer> lst, int k) {
        Integer i = lst.get(k-1);
        lst.set(k-1, lst.get(lst.size() - k));
        lst.set(lst.size() - k, i);
    }
}
