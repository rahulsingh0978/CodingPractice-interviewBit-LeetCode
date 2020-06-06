package rahul_practice.com.practice;

import java.util.ArrayList;

public class FlipString {

	public static ArrayList<Integer> flip(String A) {

		ArrayList<Integer> result = new ArrayList<Integer>();

		int start = 1;
		result.add(0);
		result.add(0);
		int count = -1;
		boolean all1 = true;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < A.length(); i++) {
			if (count < 0) {
				count = 0;
				start = i + 1;
			}
			char c = A.charAt(i);
			if (c == '0') {
				count++;
				all1 = false;
			} else
				count--;

			if (count > max) {
				max = count;
				result.set(0, start);
				result.set(1, i + 1);
			}
		}
		if (all1)
			return new ArrayList<Integer>();
		return result;
	}

	public static void main(String[] args) {
		String s = "110100110";
		ArrayList<Integer> r = flip(s);
		for (int i : r) {
			System.out.print(i + " ");
		}

	}
}
