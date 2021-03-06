package interviewBits;

import java.util.ArrayList;

public class NoOfSwapsXO {
	public int countSwaps(String A) {
		ArrayList<Integer> lst = new ArrayList<>();
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == 'x') {
				lst.add(i);
			}
		}
		int s = 0;
		int e = 0;
		int mid = lst.size()/2;
		int total=0;
		for(int i=0;i<lst.size();i++) {
			s=lst.get(i);
			e=lst.get(mid)-mid+i;
			total+=absoluteDiff(e,s);
		}
		return total;

	}

	public int absoluteDiff(int a, int b) {
		int val = a - b;
		if (val < 0) {
			return val * -1;
		}
		return val;
	}
	public static void main(String[] args) {
		String s = "....x..xx...x..";
		NoOfSwapsXO obj = new NoOfSwapsXO();
		System.out.println(obj.countSwaps(s));
	}
}
