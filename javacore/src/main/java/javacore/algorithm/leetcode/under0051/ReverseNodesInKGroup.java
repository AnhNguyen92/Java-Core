package javacore.algorithm.leetcode.under0051;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 25. Reverse Nodes in k-Group
 */
public class ReverseNodesInKGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> lst = new ArrayList<>();
        travel(lst, head);
        int temp;
        for (int i = 0; i < lst.size(); i += k) {
        	int j = i + k - 1;
        	if (j < lst.size()) {        		
        		int l = i;
        		while (l < j) {
        			temp = lst.get(l);
        			lst.set(l, lst.get(j));
        			lst.set(j, temp);
        			l++;
        			j--;
        		}
        	}
        }
        updateNode(lst, head, 0);
        return head;
    }
	
	private void updateNode(List<Integer> lst, ListNode head, int i) {
		if (head != null) {
			head.val = lst.get(i);
			updateNode(lst, head.next, i + 1);
		}
	}
	
	private void travel(List<Integer> lst, ListNode head) {
		if (head != null) {
			lst.add(head.val);
			travel(lst, head.next);
		}
	}
	
}
