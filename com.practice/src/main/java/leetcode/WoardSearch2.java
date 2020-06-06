package leetcode;

import java.util.ArrayList;
import java.util.List;

public class WoardSearch2 {
	static boolean[][] isVisited;
	
	public List<String> findWords(char[][] board, String[] words) {
		int row = board.length;
		int col = board[0].length;
		List<String> result = new ArrayList();
		for (String word : words) {
			isVisited = new boolean[row][col];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if(word.charAt(0)==board[i][j]) {
						helper(board,i,j,0,word,isVisited,result);
					}
				}
			}
		}
		return result;
	}
	
	public void helper(char[][] board,int r,int c,int index,String word,boolean[][] isVisited,List<String> result) {
		if(index==word.length()) {
			result.add(word);
		}
		if(r<0||c<0||r>=board.length||c>=board[0].length||isVisited[r][c]) {
			return;
		}
		else {
			isVisited[r][c]=true;
			helper(board,r+1,c,index+1,word,isVisited,result);
			helper(board,r-1,c,index+1,word,isVisited,result);
			helper(board,r,c+1,index+1,word,isVisited,result);
			helper(board,r,c-1,index+1,word,isVisited,result);
		}
	}
	
}
