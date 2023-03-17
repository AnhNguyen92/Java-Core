package javacore.algorithm.leetcode.under1500;

import java.util.HashMap;
import java.util.List;

/*
 * LeetCode 1436. Destination City
 */
public class DestinationCity {
	public String destCity(List<List<String>> paths) {
        HashMap<String, String> HM = new HashMap<>();
        for (List<String> innerList : paths ) {
            HM.put(innerList.get(0), innerList.get(1));
        }
        String s = paths.get(0).get(0);
        while(HM.containsKey(s)){
            String m=HM.get(s);
            s=m;
        }
        return s;
    }
}
