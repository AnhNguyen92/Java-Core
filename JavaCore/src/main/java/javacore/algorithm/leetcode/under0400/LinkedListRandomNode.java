package javacore.algorithm.leetcode.under0400;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 382. Linked List Random Node
 */
public class LinkedListRandomNode {
	private List<Integer> array = new ArrayList<>();
    private int n;

    private int randRange(int min, int max) {
        return (int) (Math.random() * n);
    }

    public LinkedListRandomNode(ListNode head) {
        while (head != null) {
            array.add(head.val);
            head = head.next;
        }
        n = array.size();
    }
    
    public int getRandom() {
        return array.get(randRange(0, n));
    }
}

/**
 * Your LinkedListRandomNode object will be instantiated and called as such:
 * LinkedListRandomNode obj = new LinkedListRandomNode(head);
 * int param_1 = obj.getRandom();
 */
