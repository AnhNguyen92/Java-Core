package javacore.algorithm.leetcode.under2000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * LeetCode 1985
 */
public class FindTheKthLargestIntegerInTheArray {
	public String kthLargestNumber(String[] nums, int k) {
        List<String> lst = Arrays.stream(nums).sorted((a,b) -> {
				if (a.length() != b.length())
					return b.length() - a.length();
				for (int i = 0; i < a.length(); i++) {
					if (a.charAt(i) - b.charAt(i) != 0)
						return b.charAt(i) - a.charAt(i);
				}
				return 0;
			}).collect(Collectors.toList());
        return lst.get(k-1);

    }
	
	public String kthLargestNumber1(String[] nums, int k) {
		Arrays.sort(nums, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() != s2.length())
					return s2.length() - s1.length();
				for (int i = 0; i < s1.length(); i++) {
					if (s1.charAt(i) - s2.charAt(i) != 0)
						return s2.charAt(i) - s1.charAt(i);
				}
				return 0;
			}
		});
		return nums[k - 1];
	}
}
