package rahul_practice.com.practice;

public class LongestPalindromeSubstringDP {
	public static void LongestPalindrome(String s) {
		int n = s.length();
		int palLen=0;
		boolean[][] mat = new boolean[n][n];
		String[] val = s.split("");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = false;
			}
		}
		
		for(int i =0;i< n;i++) {
			mat[i][i]=true;
		}
		
		for(int i=0;i<n-1;i++) {
			if(val[i].equalsIgnoreCase(val[i+1])) {
				mat[i][i+1]=true;
			}
		}
		
		int j,st=0;
		for(int k=2;k<n;k++) {
			for(int i=0;i<n-k;i++) {
				j=i+k;
				//System.out.println(val[i].equalsIgnoreCase(val[j])+" "+val[i]+" "+val[j]+" "+mat[i+1][j-1]);
				if(val[i].equalsIgnoreCase(val[j]) && mat[i+1][j-1]==true) {
					mat[i][j]=true;
					if(j+1-i>palLen) {
						palLen=j+1-i;
						st=i;
						//String ss = s.substring(i,k);
						//System.out.println(ss);
					}
				}
			}
		}
		
		
		System.out.println(s.substring(st,st+palLen)+" "+palLen);
		
		
		
	}
	
	
	 public static String longestPalindrome(String s) {
	        int n = s.length();
	        boolean[][] mat = new boolean[n][n];
	        int palLen=1;
	        int start=0;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                mat[i][j]=false;
	            }
	        }
	        
	        for(int i=0;i<n;i++){
	            mat[i][i]=true;
	        }
	        
	        for(int i=0;i<n-1;i++){
	            if(s.charAt(i)==s.charAt(i+1)){
	                mat[i][i+1]=true;
	                if(palLen<2) {
	                	palLen=2;
	                	start=i;
	                }
	            }
	        }
	        
	        int j;
	        for(int k=2;k<n;k++){
	            for(int i=0;i<n-k;i++){
	                j=i+k;
	                if(s.charAt(i)==s.charAt(j) && mat[i+1][j-1]==true){
	                    mat[i][j]=true;
	                    if(j+1-i>palLen){
	                        start=i;
	                        palLen=j+1-i;
	                    }
	                }
	            }
	        }
	        return s.substring(start,start+palLen);
	    }
	public static void main(String[] args) {
		
		LongestPalindrome("ccc");
		System.out.println(longestPalindrome("ccc"));
		//System.out.println("rahul".charAt(0)=="rahul".charAt(1));
		//System.out.println("rahul".substring(1,3));
	}
}
