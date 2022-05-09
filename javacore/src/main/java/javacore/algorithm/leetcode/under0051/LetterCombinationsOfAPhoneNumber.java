package javacore.algorithm.leetcode.under0051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 17
 */
public class LetterCombinationsOfAPhoneNumber {
	
	public List<String> letterCombinations(String digits) {
        Map<Character, List<String>> map = new HashMap<>();
		map.put('2', Arrays.asList("a", "b" , "c"));
		map.put('3', Arrays.asList("d", "e" , "f"));
		map.put('4', Arrays.asList("g", "h" , "i"));
		map.put('5', Arrays.asList("j", "k" , "l"));
		map.put('6', Arrays.asList("m", "n" , "o"));
		map.put('7', Arrays.asList("p", "q" , "r" , "s"));
		map.put('8', Arrays.asList("t", "u" , "v"));
		map.put('9', Arrays.asList("w", "x" , "y" , "z"));
		List<String> ans = new ArrayList<>();
		for (int i = 0; i < digits.length(); i++) {
			List<String> list = map.get(digits.charAt(i));
			if (!ans.isEmpty()) {
				int size = ans.size();
				for (int j = 0; j < size; j++) {
					String s = ans.get(j);
					for (String item : list)
						ans.add(s + item);
				}
				int k = i;
				ans.removeIf(item -> item.length() == k);
			} else {
				ans.addAll(map.get(digits.charAt(0)));
			}
		}
        return new ArrayList<>(ans); 
    }
}
