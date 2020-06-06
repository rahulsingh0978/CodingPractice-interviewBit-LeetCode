package rahul_practice.com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoogleBackTracking {
	public static int[] R = {0,0,-1,1,-1,1,-1,1};
	public static int[] C = {-1,1,0,0,-1,1,1,-1};
	public static void FindWords(Character[][] char2d , List<String> dictionary,Boolean[][] visited,int row,int col,String word) {
		//System.out.println(char2d.length*char2d[0].length);
		//System.out.println(word);
		if(dictionary.contains(word)) {
			System.out.println(word);
		}
		if(word.length()==char2d.length*char2d[0].length) {
			return;
		}
		for(int i=0;i<R.length;i++) {
			int newRow = row+R[i];
			int newCol = col+C[i];
			if(isVisited(visited, newRow, newCol)) {
				visited[newRow][newCol] = true;
				FindWords(char2d, dictionary, visited, newRow, newCol, word+char2d[newRow][newCol]);
				visited[newRow][newCol] = false;
			}
		}
		
	}
	
	public static boolean isVisited(Boolean[][] visited,int row,int col) {
		if(row>=0 && row<3 && col>=0 && col<3 && !visited[row][col]) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Character[][] ch = {{'G','I','Z'},{'U','E','K'},{'Q','S','E'}};
		List<String> dict = new ArrayList<String>(Arrays.asList("GEEKS","QUIZ","FOR","EUGE"));
		Boolean[][] visited = {{false,false,false},{false,false,false},{false,false,false}};
		//System.out.println("row "+ch.length+" col "+ch[0].length);
		String s = "";
		for(int i=0;i<3;i++) {
			for(int j=0;j<3; j++) {
				visited[i][j]=true;
				FindWords(ch,dict,visited,0,0,s+ch[i][j]);
				visited[i][j]=false;
			}
			 
		}
		
	}
}
