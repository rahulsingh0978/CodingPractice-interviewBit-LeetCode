package interviewBits;

public class BlackShapesDFS {
	public int black(String[] A) {
		char[][] input = new char[A.length][A[0].length()];
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length(); j++) {
				input[i][j] = A[i].charAt(j);
			}
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length(); j++) {
				if (input[i][j] == 'X') {
					dfs(input, i, j, A.length, A[0].length());
					count++;
				}
			}
		}
		return count;
	}

	public void dfs(char[][] input, int r, int c, int R, int C) {
		if (r < 0 || r >= R || c < 0 || c >= C || input[r][c] == 'O') {
			return;
		} else {
			input[r][c] = 'O';
			dfs(input, r + 1, c, R, C);
			dfs(input, r - 1, c, R, C);
			dfs(input, r, c + 1, R, C);
			dfs(input, r, c - 1, R, C);
			
		}
	}

	public static void main(String[] args) {
		BlackShapesDFS obj = new BlackShapesDFS();
		String[] ar = { "OOOXOOO",
				        "OOXXOXO", 
				        "OXOOOXO" };
		System.out.println(obj.black(ar));
	}
}
