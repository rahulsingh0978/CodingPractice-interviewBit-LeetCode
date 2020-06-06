package rahul_practice.com.practice;


public class BinaryTree {
	BTNode root;
	BinaryTree(){
		root=null;
	}
	void printInorder(BTNode root) {
		if(root ==null)
			return;
		System.out.println(root.data);
		printInorder(root.left);
		printInorder(root.right);
	}
	public static void main(String[] args) {
		BinaryTree node =new BinaryTree();
		node.root = new BTNode(23);
		node.root.left = new BTNode(2);
		node.root.right = new BTNode(34);
		node.root.right.left = new BTNode(22);
		node.printInorder(node.root);
		
	}
}
