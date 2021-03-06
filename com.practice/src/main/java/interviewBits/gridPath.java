package interviewBits;

public class gridPath {
	public int uniquePathsWithObstacles(int[][] A) {
		int r = A.length;
		if (r == 0) {
			return r;
		}
		int c = A[0].length;
		if (A[0][0] == 1 || A[r - 1][c - 1] == 1) {
			return 0;
		}
		int[][] lookup = new int[r][c];
		lookup[0][0] = 1;
		for (int i = 1; i < r; i++) {
			if (A[i][0] != 1)
				lookup[i][0] = lookup[i-1][0];
		}
		for (int j = 1; j < c; j++) {
			if (A[0][j] != 1)
				lookup[0][j] = lookup[0][j-1];
		}
		for (int i = 1; i < r; i++) {
			for (int j = 1; j < c; j++) {
				if (A[i][j] == 0) {
					lookup[i][j] = lookup[i - 1][j] + lookup[i][j - 1];
				} else {
					lookup[i][j] = 0;
				}
			}
		}
		return lookup[r - 1][c - 1];
	}

	public int uniquePathsWithObstacles1(int[][] A) {
		int row = A.length;
		int col = A[0].length;
		int[][] ar = new int[row][col];
		if (A[0][0] == 1)
			return 0;
		ar[0][0] = 1;
		for (int i = 1; i < row; i++) {
			if (A[i][0] == 0) {
				ar[i][0] = ar[i - 1][0];
			} else {
				ar[i][0] = 0;
			}
		}

		for (int j = 1; j < col; j++) {
			if (A[0][j] == 0) {
				ar[0][j] = ar[0][j - 1];
			} else {
				ar[0][j] = 0;
			}
		}

		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if (A[i][j] == 1) {
					ar[i][j] = 0;
				} else {
					ar[i][j] = ar[i - 1][j] + ar[i][j - 1];
				}
			}
		}

		return ar[row - 1][col - 1];
	}

	public static void main(String[] args) {
		//int[][] A = { { 0, 0 }, { 0, 0 }, { 0, 0 }, { 1, 0 }, { 0, 0 } };
		int[][] A = { { 0}};
		gridPath obj = new gridPath();
		System.out.println(obj.uniquePathsWithObstacles(A));
	}
}