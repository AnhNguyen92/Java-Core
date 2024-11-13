package javacore.algorithm.leetcode.under0300;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 284. Peeking Iterator
 */
public class PeekingIterator implements Iterator<Integer> {
    // Java Iterator interface reference:
    // https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
    List<Integer> lst = new ArrayList<>();
    int cur = 0;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        while (iterator.hasNext()) {
            lst.add(iterator.next());
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return lst.get(cur);
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        return lst.get(cur++);
    }

    @Override
    public boolean hasNext() {
        return cur < lst.size();
    }
}
