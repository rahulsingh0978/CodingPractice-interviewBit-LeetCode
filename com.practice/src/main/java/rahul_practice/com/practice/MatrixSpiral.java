package rahul_practice.com.practice;

public class MatrixSpiral {
	public static int[] spiralOrder(final int[][] A) {
		int row = A.length;
		int col = A[0].length;
		int[] final_op;
		int len = 0;
		if (row == 1) {
			final_op = new int[col];
			// int i=0;
			for (int i : A[0])
				final_op[len++] = i;
		} else if (col == 1) {
			final_op = new int[row];
			for (int j = 0; j < row; j++) {
				final_op[len++] = A[j][0];
			}
		} else {
			final_op = new int[row * col];
			int l = 0;
			int r = col;
			int t = 0;
			int b = row;
			int count = 0;
			int size = row * col;
			while (count < size) {
				for (int i = l; i < r; i++) {
					if (count == size)
						break;
					final_op[len++] = A[l][i];
					count++;

				}
				t++;
				for (int j = t; j < b; j++) {
					if (count == size)
						break;
					final_op[len++] = A[j][r - 1];
					count++;
				}
				r--;
				for (int k = r - 1; k >= l; k--) {
					if (count == size)
						break;
					final_op[len++] = A[b - 1][k];
					count++;
				}
				b--;
				for (int m = b - 1; m >= t; m--) {
					if (count == size)
						break;
					final_op[len++] = A[m][l];
					count++;
				}
				l++;
			}
		}
		return final_op;
	}

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		// System.out.println(a.length);
		// System.out.println(a[0].length);
		int[] b = spiralOrder(a);
		for (int i : b) {
			System.out.print(i + " ");
		}

	}
}
