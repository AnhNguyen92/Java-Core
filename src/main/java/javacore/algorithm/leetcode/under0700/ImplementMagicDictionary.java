package javacore.algorithm.leetcode.under0700;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 676. Implement Magic Dictionary
 */
public class ImplementMagicDictionary {
    class MagicDictionary {
        Map<Integer, List<String>> map;
        public MagicDictionary() {
            map = new HashMap<>();
        }

        public void buildDict(String[] dictionary) {
            for (String d : dictionary) {
                int len = d.length();
                List<String> lst = map.getOrDefault(len, new ArrayList<>());
                lst.add(d);
                map.put(len, lst);
            }
        }

        public boolean search(String searchWord) {
            List<String> compare = map.get(searchWord.length());
            if (compare != null) {
                for (String word : compare) {
                    if (canChange(word, searchWord))
                        return true;
                }
            }
            return false;
        }

        private boolean canChange(String s, String t) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != t.charAt(i)) {
                    count++;
                }
            }
            return count == 1;
        }
    }

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */
}
