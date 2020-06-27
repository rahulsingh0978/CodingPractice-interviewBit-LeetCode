package leetcode;

public class RotateArray {
	public int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public void rotate(int[] nums, int k) {
		int n = nums.length;
		if (k == 0) {
			return;
		} else {
			int gcd_val = gcd(n, k);

			int temp;
			for (int i = 0; i < k; i++) {
				int l = n - 1 - i;
				temp = nums[l]; //
				int j = l - gcd_val;
				while (j > -1) {
					nums[l] = nums[j];
					l = j;
					j -= gcd_val;
				}

				nums[l] = temp;
			}
		}
	}

	public static void main(String[] args) {
		RotateArray obj = new RotateArray();
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };

		obj.rotate(a, 3);
		
		
	}
}
