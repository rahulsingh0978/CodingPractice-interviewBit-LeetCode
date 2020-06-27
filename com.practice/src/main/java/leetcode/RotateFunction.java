package leetcode;

public class RotateFunction {
	public int maxRotateFunction(int[] A) {
		int n = A.length;
		if (n <= 1) {
			return 0;
		}

		long max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			long cmax = Integer.MIN_VALUE;
			if (i != 0) {
				reverse(0, n - 1, A);
				reverse(0, i - 1, A);
				reverse(i, n - 1, A);
			}
			for (int j = 0; j < n; j++) {
				cmax += A[j] * j;
			}
			max = max > cmax ? max : cmax;
		}
		return (int)max;
	}

	public void reverse(int s, int e, int[] ar) {
		while (s < e) {
			int temp = ar[s];
			ar[s] = ar[e];
			ar[e] = temp;
			s++;
			e--;
		}
	}

	public static void main(String[] args) {
		RotateFunction obj = new RotateFunction();
		int[] in = { -2147483648, -2147483648 };
		System.out.println(Integer.MIN_VALUE);
		System.out.println(obj.maxRotateFunction(in));
	}
}
