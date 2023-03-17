package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * LeetCode 187. Repeated DNA Sequences
 */
public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String sub = s.substring(i, i + 10);
            if (!seen.add(sub) && !result.contains(sub)) {
                result.add(sub);
            }
        }
        return result;
    }
}
