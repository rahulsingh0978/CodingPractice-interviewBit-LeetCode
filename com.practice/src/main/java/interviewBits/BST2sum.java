package interviewBits;

import java.util.HashSet;
import java.util.Iterator;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}

public class BST2sum {
	HashSet<Integer> hs;

	public int t2Sum(TreeNode A, int B) {
		if (A == null) {
			return 0;
		} else {
			this.hs = new HashSet<Integer>();
			if(traverseAndFillHash(A, this.hs, B)) {
				return 1;
			}

			return 0;
		}
	}

	public boolean traverseAndFillHash(TreeNode A, HashSet<Integer> hs, int b) {
		if (A == null) {
			return false;
		} else {
			if (traverseAndFillHash(A.left, hs, b)) {
				return true;
			}
			if (hs.contains(b-A.val)) {
				return true;
			} else {
				hs.add(A.val);
			}

			return traverseAndFillHash(A.right, hs, b);
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		BST2sum obj = new BST2sum();
		System.out.println(obj.t2Sum(root, 19));
		
		int[][] a = new int[2][2];
		
	}
}
