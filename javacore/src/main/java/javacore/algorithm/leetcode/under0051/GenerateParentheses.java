package javacore.algorithm.leetcode.under0051;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * LeetCode 22
 */
public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
        String s = "()";
        List<String> lst = new ArrayList<>();
        lst.add(s);
        Set<String> set = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            int len = lst.size();
            for(int j = 0; j < len; j++) {
                String str = lst.get(0);
                for (int k = 0; k < str.length(); k++) {
                    String temp = str.substring(0, k+1) + s + str.substring(k+1);
                    if (!set.contains(temp)) {
                        set.add(temp);
                        lst.add(temp);
                    }
                }
                lst.remove(str);
            }
        }
        
        return lst;
    }
}
