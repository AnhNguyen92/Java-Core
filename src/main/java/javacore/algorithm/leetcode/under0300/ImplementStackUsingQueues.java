package javacore.algorithm.leetcode.under0300;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 225. Implement Stack using Queues
 */
public class ImplementStackUsingQueues {
    class MyStack {
        private List<Integer> list;

        /**
         * Initialize your data structure here.
         */
        public MyStack() {
            list = new ArrayList<>();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            list.add(0, x);
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            int x = list.get(0).intValue();
            list.remove(0);
            return x;
        }

        /**
         * Get the top element.
         */
        public int top() {
            return list.get(0).intValue();
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return list.isEmpty();
        }
    }

    /**
     * Your MyStack object will be instantiated and called as such: MyStack obj =
     * new MyStack(); obj.push(x); int param_2 = obj.pop(); int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
}
