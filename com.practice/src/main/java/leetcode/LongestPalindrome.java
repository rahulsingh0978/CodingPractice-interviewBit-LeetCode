package leetcode;

public class LongestPalindrome {
	public String longestPalindrome(String s) {
		int n = s.length();
		if(n<2) {
			return s;
		}
		int res=1;
		boolean[][] lookup = new boolean[n][n];
		for(int i=0;i<n;i++) {
			lookup[i][i]=true;
		}
		for(int i=0;i<n-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				lookup[i][i+1]= true;
				res = 2;
			}
		}
		int j;
		
		int start=0;
		int end = 0;
		for(int k=2 ;k<n;k++) {
			for(int i=0;i<n-k;i++) {
				j=i+k;
				if(s.charAt(i)==s.charAt(j) && lookup[i+1][j-1]) {
					lookup[i][j]=true;
					if(j-i+1>res) {
						res = j-i+1;
						start = i;
						
					}
				}
			}
		}
		
		return s.substring(start,start+res);
	}
	public static void main(String[] args) {
		boolean[][] b =new boolean[1][1];
		System.out.println(b[0][0]);
	}
}
