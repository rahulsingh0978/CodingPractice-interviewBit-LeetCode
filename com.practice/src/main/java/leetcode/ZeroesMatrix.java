package leetcode;

public class ZeroesMatrix {
	public static void convertRCtoZero(int mat[][], int R, int C) {
		int row[] = new int[R];
		int col[] = new int[C];
		int i, j;
		for (i = 0; i < R; i++) {
			row[i] = Integer.MAX_VALUE;
		}
		for (i = 0; i < C; i++) {
			col[i] = Integer.MAX_VALUE;
		}
		for (i = 0; i < R; i++) {
			for (j = 0; j < C; j++) {
				if (mat[i][j] == 0) {
					row[i] = 0;
					col[j] = 0;
				}
			}
		}
		for (i = 0; i < R; i++) {
			for (j = 0; j < C; j++) {
				if (row[i] == 0 || col[j] == 0) {
					mat[i][j] = 0;
				}
			}
		}
	}
	public static void printMatrix(int mat[][], int R, int C) {
		int i, j;
		for (i = 0; i < R; i++) {
			for (j = 0; j < C; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int mat[][] = { { 1, -10, 3 }, { 0, 4, -5 }, { 10, 6, 0 }, };

		System.out.println("Matrix Intially");

		printMatrix(mat, 3, 3);

		convertRCtoZero(mat, 3, 3);
		System.out.println("Matrix after modification n");
		printMatrix(mat, 3, 3);

	}

}
