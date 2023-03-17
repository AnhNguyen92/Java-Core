package javacore.algorithm.leetcode.under0900;

import java.util.HashMap;
import java.util.Map;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 817. Linked List Components
*/
public class LinkedListComponents {
	public int numComponents(ListNode head, int[] nums) {
        int count = 0;
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], true);
        }
        while (head != null) {
            if (map.get(head.val) != null) {
                count++;
                while (head != null && map.get(head.val) != null) {
                    head = head.next;
                }
            } else {
                head = head.next;
            }
        }
        return count;
    }
}
