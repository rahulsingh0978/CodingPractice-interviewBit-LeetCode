package leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class MaxParenthesis {
	public static int longestValidParentheses(String A) {
		int n = A.length();
		int ans = 0; // store result
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		if (n < 2) {
			return -1;
		} else {
			for (int i = 0; i < n ; i++) {
				// ( will push in stack
				if (A.charAt(i) == '(') {
					stack.push(i);
				} else {
					stack.pop();
					if (!stack.isEmpty()) {
						ans = Math.max(ans, i - stack.peek());
						
					}else {
						stack.push(i);
					}
				}

			}

		}
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(longestValidParentheses("((()()"));
		HashSet<Integer> hs = new HashSet();
		hs.add(1);
		Iterator value = hs.iterator(); 
		while (value.hasNext()) {
           System.out.println(9-(int)value.next());
            
        }
	}

}
