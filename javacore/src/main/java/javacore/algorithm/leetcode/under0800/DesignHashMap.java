package javacore.algorithm.leetcode.under0800;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 706
 */
public class DesignHashMap {
	Map<Integer, Integer> map = new HashMap<>();

	/** Initialize your data structure here. */
	public DesignHashMap() {

	}

	/** value will always be non-negative. */
	public void put(int key, int value) {
		map.put(key, value);
	}

	/**
	 * Returns the value to which the specified key is mapped, or -1 if this map
	 * contains no mapping for the key
	 */
	public int get(int key) {
		if (map.containsKey(key))
			return map.get(key).intValue();
		return -1;
	}

	/**
	 * Removes the mapping of the specified value key if this map contains a mapping
	 * for the key
	 */
	public void remove(int key) {
		map.remove(key);
	}
}

/**
 * Your MyHashMap object will be instantiated and called as such: MyHashMap obj
 * = new MyHashMap(); obj.put(key,value); int param_2 = obj.get(key);
 * obj.remove(key);
 */