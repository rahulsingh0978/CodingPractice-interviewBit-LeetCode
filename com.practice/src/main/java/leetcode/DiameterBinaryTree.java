package leetcode;

public class DiameterBinaryTree {
	class A{
        int val;
    }
    //int answer;
    public int diameterOfBinaryTree(TreeNode root) {
        A a = new A();
        a.val = Integer.MIN_VALUE; 
        int val = helper(root , a);
        return a.val;
    }
    public int helper(TreeNode root,A answer){
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
    	
    	TreeNode root = new TreeNode(1);
    	root.left = new TreeNode(2);
    	root.right = new TreeNode(3);  
        root.left.left = new TreeNode(4);  
        root.left.right =new TreeNode(5);
    	
    	
    	
    	DiameterBinaryTree obj = new DiameterBinaryTree();
    	System.out.println(obj.diameterOfBinaryTree(root));
	}
}
