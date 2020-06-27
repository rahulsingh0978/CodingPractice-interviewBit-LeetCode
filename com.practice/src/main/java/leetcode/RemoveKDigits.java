package leetcode;

import java.util.Stack;

public class RemoveKDigits {
	public static String removeKdigits(String num, int k) {
		char[] arr = num.toCharArray();
		int n = arr.length;
		if (n == 0 || k >= n) {
			return new String("0");
		}
		if (k == 0) {
			return String.valueOf(num);
		}
		Stack<Integer> s = new Stack<>();
		int i = 0;
		s.push(Integer.parseInt(arr[i] + ""));
		i++;
		while (i < n) {
			while (!s.isEmpty() && k > 0 && s.peek() > Integer.parseInt(arr[i] + "")) {
				s.pop();
				//s.push(Integer.parseInt(arr[i] + ""));
				k--;
			}
			if(!s.isEmpty() || arr[i] !='0') {
				s.push(Integer.parseInt(arr[i] + ""));
			}
			i++;
		}
		
		while (!s.isEmpty() && k-->0 ) {
			s.pop();
		}
		if(s.isEmpty()) {
			return new String("0");
		}
		StringBuilder result = new StringBuilder();
		while (!s.isEmpty()) {
			result.append(s.pop());
		}
		return String.valueOf(Integer.parseInt(result.reverse().toString()));
	}

	public static void main(String[] args) {
		System.out.println(RemoveKDigits.removeKdigits("10200" , 1));
	}
}
