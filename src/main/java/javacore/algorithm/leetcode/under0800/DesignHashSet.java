package javacore.algorithm.leetcode.under0800;

import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 705. Design HashSet
 */
public class DesignHashSet {
	Set<Integer> set = new HashSet<>();
    /** Initialize your data structure here. */
    public DesignHashSet() {
        
    }
    
    public void add(int key) {
        set.add(key);
    }
    
    public void remove(int key) {
        set.remove(key);
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return set.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */