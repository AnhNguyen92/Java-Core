package javacore.algorithm.leetcode.under0300;

import java.util.HashSet;
import java.util.Set;

/*
 *LeetCode 208. Implement Trie (Prefix Tree)
 */
public class ImplementTrie {
    class Trie {
        Set<String> set;
        public Trie() {
            set = new HashSet<>();
        }

        public void insert(String word) {
            set.add(word);
        }

        public boolean search(String word) {
            for (String s : set) {
                if (s.equals(word)) {
                    return true;
                }
            }
            return false;
        }

        public boolean startsWith(String prefix) {
            for (String s : set) {
                if (s.startsWith(prefix)) {
                    return true;
                }
            }
            return false;
        }
    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
}
