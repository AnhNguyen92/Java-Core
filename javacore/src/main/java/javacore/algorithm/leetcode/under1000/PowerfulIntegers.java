package javacore.algorithm.leetcode.under1000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * LeetCode 970
 */
public class PowerfulIntegers {
	public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> ans = new ArrayList<>();
        int a = 1;
        int b = 1;
        while (a + b <= bound) {
            ans.add(a + b);
            while ( y > 1 && a + b * y <= bound) {
                ans.add(a + b * y);
                b *= y;
            }
            if (x > 1) {
                a *= x;
                b = 1;
            } else {
                break;
            }
            
        }
        Collections.sort(ans);
        Set<Integer> set = new HashSet<>(ans);
        
        return new ArrayList<>(set);
    }
}
