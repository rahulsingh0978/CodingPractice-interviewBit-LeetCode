package rahul_practice.com.practice;

public class MatrixZigZag {

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		/*
		 * for(int i =0;i<4;i++) { for(int j =0; j<4;j++) {
		 * System.out.print(mat[i][j]+"  "); } System.out.println();
		 * System.out.println(); }
		 */

		/*
		 * 1   2   3   4 
		 * 5   6   7   8 
		 * 9   10  11  12 
		 * 13  14  15  16
		 *
		 */
		int row = 4;
		boolean temp = true;
		int r, c;
		for (int k = 0; k < 7; k++) {
			if (!temp) {// even up diagonal
				if (k < row) {
					r = 0;
					c = k;
				} else {
					c = row-1;
					r = k - row + 1;
				}

				while (r <= k && c >= 0 && r < row) {
					System.out.print(mat[r][c] + " ");

					r++;

					c--;

				}
				temp = true;
			} else { // odd down diagonal
				if (k < row) {
					r = k;
					c = 0;
				} else {
					r = row-1;
					c = k - row +1;
				}
				while (c <= k && r >= 0 && c < row) {
					System.out.print(mat[r][c] + " ");

					c++;

					r--;
				}
				temp = false;
			}
		}
	}
}
