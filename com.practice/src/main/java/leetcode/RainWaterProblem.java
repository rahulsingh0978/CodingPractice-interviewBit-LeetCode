package leetcode;

public class RainWaterProblem {

	public static int trap(final int[] A) {
		int water = 0;
		int lmax = 0;
		int rmax = 0;
		int l = 0;
		int r = A.length - 1;
		while (l < r) {
			if (A[l] < A[r]) {
				if (lmax < A[l]) {
					lmax = A[l];
				} else {
					water += lmax - A[l];

				}
				l++;
			} else {
				if (rmax < A[r]) {
					rmax = A[r];
				} else {
					water += rmax - A[r];

				}
				r--;
			}
		}
		return water;
	}

	public static int maxArea(int[] height) {
		int maxLeft = 0, maxRight = 0;
		int l = 0, r = height.length - 1;
		int result = 0;
		while (l <= r) {
			if (height[l] < height[r]) {
				if (height[l] > maxLeft) {
					maxLeft = height[l];
				} else {
					result += maxLeft - height[l];
				}
				l++;

			} else {
				if (height[r] > maxRight) {
					maxRight = height[r];
				} else {
					result += maxRight - height[r];
				}
				r--;

			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] ht = { 1, 0, 0, 0, 0, 4, 8, 3, 7 };
		 System.out.println(maxArea(ht));
		System.out.println(trap(ht));
	}

}
