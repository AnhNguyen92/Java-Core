package javacore.algorithm.leetcode.under0400;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javacore.algorithm.leetcode.model.NestedInteger;

/*
 * LeetCode 341
 */
public class FlattenNestedListIterator implements Iterator<Integer> {
	private List<Integer> lst = new ArrayList<>();
	private int index = 0;

	public FlattenNestedListIterator(List<NestedInteger> nestedList) {
        for (NestedInteger nestedInteger : nestedList) {
            flatten(nestedInteger);
        }
    }

	private void flatten(NestedInteger nested) {
		if (nested.isInteger())
			lst.add(nested.getInteger());
		else
			for (NestedInteger nestedFromList : nested.getList()) {
				flatten(nestedFromList);
			}
	}

	@Override
	public Integer next() {
		return lst.get(index++);
	}

	@Override
	public boolean hasNext() {
		return index < lst.size();
	}
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList); while (i.hasNext()) v[f()]
 * = i.next();
 */