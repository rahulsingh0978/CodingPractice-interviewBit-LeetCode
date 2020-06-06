package rahul_practice.com.practice;

public class KnightTourProblem {
	public static int[] R = { 2, 1, -1, -2, -2, -1, 1, 2 };
	public static int[] C = { 1, 2, 2, 1, -1, -2, -2, -1 };
	public static int Row = 8;
	public static int Col = 8;

	public static boolean knightMove(int[][] visited, int row, int col, int move) {
		if (move == Row * Col) {
			for (int i = 0; i < Row;i++) {
				for (int j = 0; j < Col; j++) {
					System.out.print(visited[i][j] + " ,");
				}
				System.out.println();
				
			}
			return true;
		} else {
			for (int i = 0; i < R.length; i++) {
				int newRow = row + R[i];
				int newCol = col + C[i];
				if (isvisited(visited, newRow, newCol)) {
					move++;
					visited[newRow][newCol]=move;
					if(knightMove(visited, newRow, newCol, move)) {
						return true;
					}
					move--;
					visited[newRow][newCol]=0;
				}
			}
		}
		return false;
	}

	public static boolean isvisited(int[][] visited, int r, int c) {
		if (r >= 0 && r < Row && c >= 0 && c < Col && visited[r][c] == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[][] visited = new int[8][8];
		visited[0][0]=1;
		System.out.println("started");
		knightMove(visited, 0, 0, 1);
		System.out.println("end");
	}
}
