package leetcode;

public class ZigZag {
	public static String printZigZag(int numRows, String s) {
		int len = s.length();
		char[][] store = new char[numRows][len];
		int i=0,r=0,k,c=0;
		//for(int t=0;t<len;t++) 
	
		while(i<len){
			while(r<numRows && i < len) {
				store[r][c] = s.charAt(i);
				i++;
				r++;
			}
			r=numRows-1;
			while(r>1 && i < len) {
				store[--r][++c] = s.charAt(i);
				i++;
			}
			r=0;
			c++;	
		}
		StringBuffer sb = new StringBuffer();
		int l=0;
		for(int t=0;t<numRows && l <s.length();t++) {
			for(int j=0;j<len && l <s.length();j++) {
				if(store[t][j]!=0) {
					//System.out.print(store[t][j]);
					sb.append(store[t][j]);
					l++;
				}
				
			}
			
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		int n = 5;
		String s = "PAYPALISHIRING";
		String op = printZigZag(n,s);
		System.out.println(op);
	}
}
