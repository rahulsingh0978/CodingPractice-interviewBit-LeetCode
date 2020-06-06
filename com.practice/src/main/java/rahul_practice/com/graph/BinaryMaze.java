package rahul_practice.com.graph;

public class BinaryMaze {

	public static void FindPath(int[][] maze, int[][] visited, int rs, int cs, int rd, int cd, int row, int col,
			int moves) {
		int rowMoves[] = { 0, 0, 1, -1 };
		int colMoves[] = { -1, 1, 0, 0 };
		if ((rs == rd) && (cs == cd)) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(" " + visited[i][j]);
				}
				System.out.println();
			}
		} else {
			int newRow, newCol;
			for (int i = 0; i < rowMoves.length; i++) {
				newRow = rs + rowMoves[i];
				newCol = cs + colMoves[i];
				if (isValidPath(visited, maze, newRow, newCol, row, col)) {
					moves++;
					visited[newRow][newCol] = moves;
					FindPath(maze, visited, newRow, newCol, rd, cd, row, col, moves);
					moves--;
					visited[newRow][newCol] = 0;
				}
			}
		}

	}

	public static boolean isValidPath(int[][] visited, int[][] maze, int r, int c, int row, int col) {
		if (r >= 0 && r < row && c >= 0 && c < col && visited[r][c] == 0 && maze[r][c] != 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		/*
		 * int[][] test = new int[2][2]; for(int i =0;i< 2;i++) { for(int j=0;j<2;j++) {
		 * System.out.print(" "+test[i][j]); } System.out.println(); }
		 */
		int[][] binmaze = { { 1, 1, 0, 1 }, { 0, 1, 1, 1 }, { 0, 1, 0, 1 }, { 0, 1, 1, 1 } };
		int[][] visited = new int[4][4];
		int moves = 0;
		FindPath(binmaze, visited, 0, 0, 0, 3, 4, 4, moves);

	}
}
