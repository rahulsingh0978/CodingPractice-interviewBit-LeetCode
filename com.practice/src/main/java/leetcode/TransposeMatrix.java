package leetcode;

import java.util.ArrayList;

public class TransposeMatrix {
	public static int[][] transpose(int[][] A) {
		int r = A.length;
		if (r == 0) {
			return null;
		}
		int c = A[0].length;
		int[][] t = new int[c][r];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				t[j][i] = A[i][j];

			}
		}
		return t;
	}

	public static void rotate(ArrayList<ArrayList<Integer>> a) {
		int r = a.size();
		if (r == 0) {
			return;
		}
		int c = a.get(0).size();
		ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < c; i++) {
			ArrayList<Integer> b1 = new ArrayList<>();
			for (int j = 0; j < r; j++) {
				b1.add(j);
			}
			b.add(b1);
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				b.get(j).remove(r - 1 - i);
				b.get(j).add(r - 1 - i, a.get(i).get(j));

			}
		}
		a.clear();
		for(ArrayList<Integer> i: b) {
			ArrayList<Integer> temp = new ArrayList<>();
			for(Integer j: i) {
				temp.add(j);
			}
			a.add(temp);
		}
		
	}

	public static void main(String[] args) {
		int[][] A = {{1,2,3},{4,5,6}};
		int[][] op = transpose(A);
		//for(int i=0;i<)
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> b = new ArrayList<>();
		
		b.add(1);
		b.add(2);
		ArrayList<Integer> b1 = new ArrayList<>();
		b1.add(3);
		b1.add(4);
		a.add(b);
		a.add(b1);
		
		rotate(a);
		
		for(ArrayList<Integer> i: a) {
			for(Integer j: i) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}
		
		
		
		
	}
}
