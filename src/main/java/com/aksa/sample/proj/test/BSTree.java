package com.aksa.sample.proj.test;

public class BSTree {

	TreeNode root;

	BSTree() {
		root = null;
	}
public void add() {
	
}
	private TreeNode addRecursive(TreeNode current, Person p) {
		if (current == null)
			return new TreeNode(p);
		if (current.key.compareTo(p) < 0) {
			current.left = addRecursive(current.left, p);

		} else if (current.key.compareTo(p) > 0) {
			current.right = addRecursive(current.right, p);
		} else {
			return current;
		}
		return current;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class TreeNode {
	Person key;
	TreeNode left;
	TreeNode right;

	TreeNode(Person p) {
		this.key = p;
		left = null;
		right = null;
	}
}
