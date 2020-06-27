package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

class TreeNode {
	int val;
	TNode left;
	TNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TNode left, TNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class LevelOrderTraversal {
	public List<List<Integer>> levelOrder(TNode root) {
		if (root == null) {
			return new ArrayList();
		}
		List<List<Integer>> result = new ArrayList<>();
		Queue<TNode> q1 = new LinkedList<>();
		Queue<TNode> q2 = new LinkedList<>();
		q1.add(root);
		while (!q1.isEmpty() || !q2.isEmpty()) {
			List<Integer> temp1 = new ArrayList<>();
			List<Integer> temp2 = new ArrayList<>();
			while (!q1.isEmpty()) {
				root = q1.poll();
				temp1.add(root.val);
				if (root.left != null) {
					q2.add(root.left);
				}
				if (root.right != null) {
					q2.add(root.right);
				}
			}
			result.add(temp1);
			while (!q2.isEmpty()) {
				root = q2.poll();
				temp2.add(root.val);
				List<Integer> temp = new ArrayList<>();
				temp.add(root.val);
				if (root.left != null) {
					q1.add(root.left);
				}
				if (root.right != null) {
					q1.add(root.right);
				}
			}
			result.add(temp2);
		}
		return result;
	}

	public List<List<Integer>> zigzagLevelOrder(TNode root) {
		if (root == null) {
			return new ArrayList();
		}
		List<List<Integer>> result = new ArrayList();
		Stack<TNode> s1 = new Stack<>();
		Stack<TNode> s2 = new Stack<>();
		s1.push(root);
		while (!s1.isEmpty() || !s2.isEmpty()) {
			List<Integer> s1Nodes = new ArrayList();
			List<Integer> s2Nodes = new ArrayList();
			while (!s1.isEmpty()) {
				root = s1.pop();
				s1Nodes.add(root.val);
				if (root.left != null) {
					s2.push(root.left);
				}
				if (root.right != null) {
					s2.push(root.right);
				}
			}
			if (!s1Nodes.isEmpty())
				result.add(s1Nodes);

			while (!s2.isEmpty()) {
				root = s2.pop();
				s2Nodes.add(root.val);
				if (root.right != null) {
					s1.push(root.right);
				}
				if (root.left != null) {
					s1.push(root.left);
				}
			}
			if (!s2Nodes.isEmpty())
				result.add(s2Nodes);

		}
		return result;

	}

	public boolean isValidBST(TNode root) {
		return checkBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

	}

	public boolean checkBst(TNode root, int min, int max) {
		if (root == null) {
			return true;
		}
		if (root.val >= max || root.val <= min) {
			return false;
		}
		return checkBst(root.left, min, root.val) & checkBst(root.right, root.val, max);
	}

	public List<Integer> inorderTraversal(TNode root) {
		List<Integer> result = new ArrayList();

		Stack<TNode> s = new Stack<>();
		while (true) {
			if (root != null) {
				s.push(root);
				root = root.left;
			} else {
				if (s.isEmpty()) {
					break;
				}
				result.add(s.peek().val);
				root = s.pop();
				root = root.right;
			}
		}
		return result;
	}

	public TNode buildTreeFromPreIn(int[] preorder, int[] inorder) {

		return helper(0, 0, inorder.length - 1, preorder, inorder);
	}

	public TNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
		if (preStart > preorder.length - 1 || inStart > inEnd) {
			return null;
		}
		TNode root = new TNode(preorder[preStart]);

		int inIndex = 0;
		for (int i = inStart; i <= inEnd; i++) {
			if (root.val == inorder[i]) {
				inIndex = i;
			}
		}
		root.left = helper(preStart + 1, inStart, inIndex - 1, preorder, inorder);
		root.right = helper(preStart + inIndex - inStart + 1, inStart, inIndex - 1, preorder, inorder);

		return root;
	}
	
	public TNode buildTreeFromPostIn(int[] postOrder, int[] inorder) {
		return helper2(postOrder.length-1,inorder.length-1,0,postOrder,inorder);
		
	}

	public TNode helper2(int postEnd, int inStart, int inEnd, int[] postOrder, int[] inorder) {
		if (postEnd < 0 || inStart < inEnd) {
			return null;
		}
		TNode root = new TNode(postOrder[postEnd]);

		int inIndex = inStart;
		for (int i = inStart; i >=0 ; i--) {
			if (root.val == inorder[i]) {
				inIndex = i;
				break;
			}
		}
		root.right = helper2(postEnd-1, inStart, inIndex + 1, postOrder, inorder);

		root.left = helper2(postEnd -(inStart-inIndex)-1 , inIndex - 1, inEnd, postOrder, inorder);
		
		return root;
	}


	public static void main(String[] args) {
		/*
		 * TreeNode n5 = new TreeNode(9, null, null); TreeNode n4 = new TreeNode(15,
		 * null, null); TreeNode n3 = new TreeNode(7, null, null); TreeNode n2 = new
		 * TreeNode(20, n4, n3); TreeNode root = new TreeNode(3, n5, n2);
		 * LevelOrderTraversal obj = new LevelOrderTraversal(); List<List<Integer>> op =
		 * obj.zigzagLevelOrder(root); for (List<Integer> o : op) { for (Integer oo : o)
		 * { System.out.print(oo + " ,"); } System.out.println(); }
		 */

		/*
		 * TreeNode n4 = new TreeNode(1, null, null); TreeNode root = new TreeNode(1,
		 * n4, null); LevelOrderTraversal obj = new LevelOrderTraversal();
		 * System.out.println(obj.isValidBST(root));
		 */
		TNode n3 = new TNode(3, null, null);
		TNode n2 = new TNode(2, n3, null);
		TNode root = new TNode(1, null, n2);
		LevelOrderTraversal obj = new LevelOrderTraversal();
		List<Integer> list = obj.inorderTraversal(root);
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}
}
