package leetcode;

public class DiameterBinaryTree {
	class A{
        int val;
    }
    //int answer;
    public int diameterOfBinaryTree(TNode root) {
        A a = new A();
        a.val = Integer.MIN_VALUE; 
        int val = helper(root , a);
        return a.val;
    }
    public int helper(TNode root,A answer){
        if(root==null){
            return 0;
        }else{
            int leftLen = helper(root.left,answer);
            int rightLen = helper(root.right,answer);
            answer.val = max(answer.val , 1+leftLen + rightLen);
            
            return 1 + max(leftLen, rightLen);
        }
    }
    
    public int max(int a,int b){
        return a>b?a:b;
    }
    public static void main(String[] args) {
    	
    	TNode root = new TNode(1);
    	root.left = new TNode(2);
    	root.right = new TNode(3);  
        root.left.left = new TNode(4);  
        root.left.right =new TNode(5);
    	
    	
    	
    	DiameterBinaryTree obj = new DiameterBinaryTree();
    	System.out.println(obj.diameterOfBinaryTree(root));
	}
}
