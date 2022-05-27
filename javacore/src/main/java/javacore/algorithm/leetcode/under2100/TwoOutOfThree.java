package javacore.algorithm.leetcode.under2100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * LeetCode 2032
*/
public class TwoOutOfThree {
	public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> lst1 = IntStream.of(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> lst2 = IntStream.of(nums2).boxed().collect(Collectors.toSet());
        Set<Integer> lst3 = IntStream.of(nums3).boxed().collect(Collectors.toSet());
        Set<Integer> lst4 = new HashSet<>();
        lst4.addAll(lst1);
        lst4.retainAll(lst3);
        lst3.retainAll(lst2);
        lst1.retainAll(lst2);
        lst1.addAll(lst3);
        lst1.addAll(lst4);
        return new ArrayList<>(lst1);
    }
}
