package leetcode;

public class EditDistance {
	public int minDistance(String word1, String word2) {
		int r = word1.length();
		int c = word2.length();
		int[][] lookup = new int[r+1][c+1];
		lookup[0][0]=0;
		for(int i=1;i<=c;i++) {
			lookup[0][i]=i;
		}
		for(int j=1;j<=r;j++) {
			lookup[j][0]=j;
		}
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(word1.charAt(i-1)==word2.charAt(j-1)) {
					lookup[i][j]=lookup[i-1][j-1];
				}else {
					lookup[i][j]=1+ minvalue(lookup[i-1][j],lookup[i][j-1],lookup[i-1][j-1]) ;
				}
			}
		}
		return lookup[r][c];
	}
	public int minvalue(int a,int b,int c) {
		int min = (a<b?a:b);
		return min>c?c:min;
	}
	public static void main(String[] args) {
		EditDistance obj = new EditDistance();
		System.out.println(obj.minDistance("azced","abcdef"));
	}
}
