package javacore.algorithm.leetcode.model;

import java.util.List;

public class NodeList {
	public int val;
    public List<NodeList> children;

    public NodeList() {}

    public NodeList(int val) {
        this.val = val;
    }

    public NodeList(int val, List<NodeList> children) {
    	this.val = val;
    	this.children = children;
    }
}
