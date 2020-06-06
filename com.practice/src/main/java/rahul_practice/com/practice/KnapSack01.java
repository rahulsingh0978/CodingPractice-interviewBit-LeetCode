package rahul_practice.com.practice;

public class KnapSack01 {
	public static void knapsack(int w, int[] val, int[] wt) {
		int[][] ar = new int[val.length + 1][w+1];
		for (int i = 0; i <= val.length; i++) {
			for (int j = 0; j <= w; j++) {
				if (i == 0 || j == 0) {
					ar[i][j] = 0;

				} else {
					if (j < wt[i-1]) {
						ar[i][j] = ar[i][j - 1];
					} else {
						ar[i][j] = Math.max(val[i-1] + ar[i - 1][j - wt[i-1]], ar[i - 1][j]);
					}
				}
			}
		}
	System.out.println("max value is "+ar[val.length][w]);
	}

	public static void main(String[] args) {
		int[] v= {1,4,5,7};
		int[] wt= {1,3,4,5};
		int W=7;
		knapsack(W,v,wt);
	}
}
