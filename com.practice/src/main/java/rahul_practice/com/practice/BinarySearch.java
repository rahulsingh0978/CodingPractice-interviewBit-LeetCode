package rahul_practice.com.practice;

import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int[] ar, int lo, int hi, int val) {
		if (lo == hi) {
			if (ar[lo] == val) {
				return lo;
			}
			return -1;
		} else {
			int mid = lo + hi / 2;
			if (ar[mid] == val) {
				return mid;
			}

			if (ar[mid] < val) {
				return binarySearch(ar, mid + 1, hi, val);
			} else {
				return binarySearch(ar, lo, mid - 1, val);
			}
		}
		
	}

	public static int iterativeBST(int[] ar, int lo, int hi, int val) {
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (ar[mid] == val) {
				return mid;
			} else if (ar[mid] < val) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int ar[] = new int[len];
		for (int i = 0; i < len; i++) {
			ar[i] = sc.nextInt();
		}
		int g = iterativeBST(ar, 0, ar.length - 1, 7);
		System.out.println(g);
		System.out.println(binarySearch(ar, 0, ar.length - 1, 4));
	}
}
