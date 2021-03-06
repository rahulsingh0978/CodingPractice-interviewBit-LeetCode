package interviewBits;

import java.util.Stack;

public class LongestParenthesis {
	public int longestValidParentheses(String A) {
		//int maxlen = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		Stack<Integer> stack = new Stack();
		stack.push(-1);
		for (int i = 0; i < A.length();) {
			if (A.charAt(i) == '(') {
				stack.push(i);
				i++;
			} else {
				stack.pop();
				if (!stack.isEmpty()) {
					max = Math.max(max, i - stack.peek());

				} else {
					stack.push(i);
				}
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		LongestParenthesis obj = new LongestParenthesis();
		System.out.println(obj.longestValidParentheses("()()"));
	}

}
