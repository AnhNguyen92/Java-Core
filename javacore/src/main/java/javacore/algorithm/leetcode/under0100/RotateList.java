package javacore.algorithm.leetcode.under0100;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.ListNode;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        List<Integer> lst = new ArrayList<>();
		while (head != null) {
			lst.add(head.val);
			head = head.next;
		}
		for (int i = 1; i <= k % lst.size(); i++) {
			lst.add(0, lst.get(lst.size() - 1));
			lst.remove(lst.size() - 1);
		}
		ListNode ans = null;
		for (int i = lst.size() - 1; i >= 0; i--) {
			ans = new ListNode(lst.get(i), ans);
		}
		return ans;
    }
}
