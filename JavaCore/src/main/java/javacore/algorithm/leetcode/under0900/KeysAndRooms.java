package javacore.algorithm.leetcode.under0900;

import java.util.List;
import java.util.Stack;

/*
 * LeetCode 841. Keys and Rooms
 */
public class KeysAndRooms {
	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size() + 1];
		Stack<Integer> stack = new Stack<>();
		visited[0] = true;
		stack.addAll(rooms.get(0));
        int count = 1;
		while (!stack.isEmpty()) {
			Integer i = stack.pop();
			if (!visited[i]) {
				visited[i] = true;
                count++;
				stack.addAll(rooms.get(i));
			}
		}
		return count == rooms.size();
	}
}
