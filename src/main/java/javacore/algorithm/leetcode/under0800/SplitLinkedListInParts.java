package javacore.algorithm.leetcode.under0800;

import java.util.HashMap;
import java.util.Map;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 725. Split Linked List in Parts
 */
public class SplitLinkedListInParts {
	public ListNode[] splitListToParts(ListNode head, int k) {
		ListNode temp = head;
		Map<Integer, ListNode> map = new HashMap<>();
		int n = 0;
		while (temp != null) {
			map.put(n++, temp);
			temp = temp.next;
		}
		ListNode[] ans = new ListNode[k];
		int q = n / k;
		int r = n % k;
		int idx = 0;
		for (int i = 0; i < k; i++) {
			ans[i] = map.get(idx);
			idx += q;
			if (idx < n) {
				if (r > 0) {
					map.get(idx).next = null;
					idx += 1;
					r--;
				} else {
					map.get(idx - 1).next = null;
				}
			}
		}
		return ans;
	}
}
