package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

class TNode {
	int val;
	TNode left;
	TNode right;
	TNode() {
	}
	TNode(int val) {
		this.val = val;
	}
	TNode(int val, TNode left, TNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class TreeRightView {

	public List<Integer> rightSideView(TNode root) {
        if(root==null){
            return new ArrayList();
        }
        Queue<TNode> q = new LinkedList();
        q.offer(root);
        List<Integer> result = new ArrayList();
        while(!q.isEmpty())
        {
        	int n = q.size();
            for(int i=0;i<n;i++){
                
                TNode temp= q.remove();
                if(i==n-1){
                    result.add(temp.val);
                }
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		TreeRightView obj = new TreeRightView();
		TNode root = new TNode(1);
		root.left = new TNode(2);
		root.right = new TNode(3);
		root.right.right = new TNode(4);
		root.left.right = new TNode(5);
		obj.rightSideView(root);
	}
}
