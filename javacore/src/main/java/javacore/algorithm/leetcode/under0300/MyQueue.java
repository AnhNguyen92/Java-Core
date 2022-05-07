package javacore.algorithm.leetcode.under0300;

import java.util.ArrayList;
import java.util.List;

/*
 * Leet code #232
 */
class MyQueue {
    private List<Integer> list = new ArrayList<>();
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        list.add(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int x = list.get(0).intValue();
        list.remove(0);
        return x;
    }
    
    /** Get the front element. */
    public int peek() {
        return list.get(0).intValue();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return list.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
