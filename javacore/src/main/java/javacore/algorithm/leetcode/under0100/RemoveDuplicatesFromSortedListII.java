package javacore.algorithm.leetcode.under0100;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 82. Remove Duplicates from Sorted List II
 */
public class RemoveDuplicatesFromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
		Map<Integer, Integer> map = new TreeMap<>();
        while (head != null) {
            map.put(head.val, map.getOrDefault(head.val, 0) + 1);
            head = head.next;
        }
        ListNode res = null;
        List<Integer> lst = new ArrayList<>();
        map.forEach((k, v) -> {
            if (v == 1) {
                lst.add(k);
            }
        });
        if (!lst.isEmpty()) {
            for (int i = lst.size() - 1; i >= 0; i--) {
                res = new ListNode(lst.get(i), res);
            }
        }
        return res;
	}
}
