package rahul_practice.com.practice;

public class leet4 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int len = nums1.length + nums2.length;
		int[] total = new int[len];
		int j = 0, k = 0, i = 0;
		while (j < nums1.length && k < nums2.length) {
			if (nums1[j] < nums2[k]) {
				total[i++] = nums1[j++];

			} else {
				total[i++] = nums2[k++];
			}
		}
		if (j == nums1.length) {
			while (k < nums2.length) {
				total[i] = nums2[k++];
				i++;
			}
		} else {
			while (j < nums1.length) {
				total[i] = nums1[j++];
				i++;
			}
		}
		if (len % 2 == 0) {
			int a = total[len / 2];
			int b = total[(len / 2) - 1];
			return (a+b) / 2.0;
		} else {
			return total[len / 2];
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2 };
		int[] b = new int[] { 3, 4 };
		double g = findMedianSortedArrays(a, b);
		System.out.println(g);

	}
}
