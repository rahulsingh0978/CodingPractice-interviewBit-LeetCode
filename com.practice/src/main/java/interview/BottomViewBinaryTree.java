package interview;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;



//{
//  int data; //data of the node
//  int hd; //horizontal distance of the node
//  Node left, right; //left and right references

//  // Constructor of tree node
//  public Node(int key)
//  {
//      data = key;
//      hd = Integer.MAX_VALUE;
//      left = right = null;
//  }
//}

class Node {
	int data;
	int hd;
	Node left, right;

	Node(int data) {
		this.data = data;
		hd = Integer.MAX_VALUE;
        left = right = null;
	}
}

class Node_Pos {
	Node node;
	int pos;
}

public class BottomViewBinaryTree {
	public void bottomView(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node_Pos> queue = new LinkedList<>();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		int dist = 0;
		Node_Pos n = new Node_Pos();
		n.node = root;
		n.pos = dist;
		queue.add(n);
		while (!queue.isEmpty()) {
			Node_Pos temp = queue.poll();
			map.put(temp.pos, temp.node.data);
			if (temp.node.left != null) {
				Node_Pos n1 = new Node_Pos();
				n1.node=temp.node.left;
				n1.pos=temp.pos -1;
				queue.add(n1);
			}
			if (temp.node.right != null) {
				Node_Pos n1 = new Node_Pos();
				n1.node=temp.node.right;
				n1.pos=temp.pos +1;
				queue.add(n1);
			}
			
		}
		
		for(Map.Entry<Integer, Integer> keyVal: map.entrySet() ) {
			System.out.print(" "+keyVal.getValue()+" ");
			
		}
	}

	public static void main(String[] args) {
		Node root = new Node(6);
		root.left = new Node(3);
		root.right = new Node(7);
		root.left.left = new Node(1);
		root.left.right = new Node(2);
		root.right.left = new Node(5);
		root.right.right = new Node(8);
		BottomViewBinaryTree obj = new BottomViewBinaryTree();
		obj.bottomView(root);
		
	}
}
