package rahul_practice.com.practice;

class BinTree {
	int data;
	BinTree left, right;

	public BinTree(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class BinaryTreePrint {
	public static void main(String[] args) {
		BinTree root = new BinTree(10);
		root.left = new BinTree(12);
		root.right = new BinTree(233);
	}

}
