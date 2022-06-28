package javacore.algorithm.leetcode.under0200;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 146
 */
public class LRUCache {

	Map<Integer, Node> map;
	Node dummyHead;
	Node dummyTail;
	int size = 0;
	int capacity;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		dummyHead = new Node();
		dummyTail = new Node();
		map = new HashMap<>();
	}

	public int get(int key) {
		Node node = map.get(key);
		if (node != null) {
			moveToHead(node);
			return node.value;
		}
		return -1;
	}

	public void put(int key, int value) {
		Node node = map.get(key);
		if (node == null) {
			Node newNode = new Node();
			newNode.key = key;
			newNode.value = value;

			map.put(key, newNode);
			addNodeToHead(newNode);
			size++;
			if (size > capacity) {
				size--;
				Node tail = removeTail();
				removeNode(tail);
			}
		} else {
			node.value = value;
			moveToHead(node);
		}
	}

	private void addNodeToHead(Node node) {
		node.next = dummyHead.next;
		node.prev = dummyHead;
		dummyHead.next.prev = node;
		dummyHead.next = node;
	}

	private Node removeTail() {
		Node ans = dummyTail.prev;
		removeNode(ans);
		return ans;
	}

	private void moveToHead(Node node) {
		removeNode(node);
		addNodeToHead(node);
	}

	private void removeNode(Node node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}
	
	class Node {
		int key;
		int value;
		Node prev;
		Node next;
	}

}

/**
 * Your LRUCache object will be instantiated and called as such: LRUCache obj =
 * new LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
 */