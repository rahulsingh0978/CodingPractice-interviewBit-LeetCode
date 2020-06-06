package rahul_practice.com.practice;

import java.util.ArrayList;

public class ArrayRotation1 {

	public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		int b = B%A.size();
		for (int i = 0; (i + b) < A.size(); i++) {
			
			ret.add(A.get(i + b));

		}
		for (int i = 0; i + 1 < b ; i++) {
			ret.add(A.get(i));
		}
		return ret;

	}

	public static void main(String[] args) {
		String val = "14, 5, 14, 34, 42, 63, 17, 25, 39, 61, 97, 55, 33, 96, 62, 32, 98, 77, 35";
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (String s : val.split(", "))
			list.add(Integer.parseInt(s));

		System.out.println(list);
		System.out.println(rotateArray(list, 56));
		
		
		System.out.println(Integer.toString(125).length());
	}
}
