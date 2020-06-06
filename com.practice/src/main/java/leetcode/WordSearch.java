package leetcode;

public class WordSearch {
	boolean[][] isVisited;

	public boolean exist(char[][] board, String word) {

		int row = board.length;
		int col = board[0].length;
		isVisited = new boolean[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (word.charAt(0) == board[i][j] && wordCheck(board, i, j, 0, word, isVisited)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean wordCheck(char[][] board, int r, int c, int index, String word, boolean[][] visited) {
		if (word.length() == index) {
			return true;
		}
		if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || word.charAt(index) != board[r][c]
				|| visited[r][c]) {
			return false;
		}
		visited[r][c] = true;
		if (wordCheck(board, r + 1, c, index + 1, word, visited) || wordCheck(board, r - 1, c, index + 1, word, visited)
				|| wordCheck(board, r, c + 1, index + 1, word, visited)
				|| wordCheck(board, r, c - 1, index + 1, word, visited)) {
			return true;
		}
		visited[r][c] = false;
		return false;
	}
	public static void main(String[] args) {
		WordSearch obj = new WordSearch();
		
				
	}
}
