package javacore.algorithm.leetcode.under0400;

import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 380. Insert Delete GetRandom O(1)
 */
public class InsertDeleteGetRandom {
    class RandomizedSet {

        Set<Integer> set;

        public RandomizedSet() {
            set = new HashSet<>();
        }

        public boolean insert(int val) {
            return set.add(val);
        }

        public boolean remove(int val) {
            return set.remove(val);
        }

        public int getRandom() {
            int idx = getRandomNumber(0, set.size());
            int i = 0;
            for (Integer x : set) {
                if (i == idx) {
                    return x.intValue();
                }
                i++;
            }
            return -1;
        }

        public int getRandomNumber(int min, int max) {
            return (int) ((Math.random() * (max - min)) + min);
        }

    }

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}
