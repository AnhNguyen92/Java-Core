package javacore.algorithm.leetcode.under0300;

import java.util.HashMap;

/*
 * Leet code 290
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> mapChar = new HashMap<>();
        HashMap<String, Character> mapWord = new HashMap<>();
        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (!mapChar.containsKey(c)) {
                if (mapWord.containsKey(w)) {
                    return false;
                } else {
                    mapChar.put(c, w);
                    mapWord.put(w, c);
                }

            } else {
                String mappedWord = mapChar.get(c);
                if (!mappedWord.equals(w))
                    return false;
            }
        }

        return true;
    }
}
