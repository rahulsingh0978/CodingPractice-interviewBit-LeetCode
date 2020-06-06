package rahul_practice.com.practice;

public class SpiralMatrix {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int R = a.length;
		int C = a[0].length;
		/*
		 * for(int i =0 ; i<R;i++) { for(int j=0;j<C;j++) System.out.print(a[i][j]+" ");
		 * System.out.println(); }
		 */
		int s = 0, e = C - 1, t = 0, b = R - 1, value = 0;
		for (int i = 0; i < (2 * R - 1); i++) {
			if (e >= 0 && s <= C - 1 && t <= R - 1 && b >= 0) {
				if (value % 4 == 0) {
					// right
					for (int j = s; j <= e; j++) {
						System.out.print(a[s][j] + " ");
					}
					t++;
					value++;
				}
				if (value % 4 == 1) {
					// bottom
					for (int k = t; k <= b; k++) {
						System.out.print(a[k][e] + " ");
					}
					e--;
					value++;
				}
				if (value % 4 == 2) {
					// left
					for (int l = e; l >= s; l--) {
						System.out.print(a[b][l]+" ");
					}
					b--;
					value++;
				} else {
					// top
					for (int m = b; m >= t; m--) {
						System.out.print(a[m][s]+" ");
					}
					s++;
					value++;
				}

			}
		}
	}
}
