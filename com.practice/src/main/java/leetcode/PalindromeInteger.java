package leetcode;

public class PalindromeInteger {
    public boolean isPalindrome(int x) {
        if (x<0) {
        	return false;
        }else {
        	String s = x+"";
        	int n = s.length();
        	if(n==1) {
        		return true;
        	}
        	int i=0,j=n-1;
        	boolean flag = true;
        	while(i<j) {
        		if(!(s.charAt(i)==s.charAt(j))) {
        			flag=false;
        		}
        		i++;
        		j--;
        	}
        	return flag;
        }
        
    }
    public static void main(String[] args) {
    	PalindromeInteger obj =  new PalindromeInteger();
    	System.out.println(obj.isPalindrome(121));
	}
}
