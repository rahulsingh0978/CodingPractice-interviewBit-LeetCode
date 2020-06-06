package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ParenthesisOpenClose {
	private HashMap<Character, Character> mapping;

	public ParenthesisOpenClose() {
		this.mapping = new HashMap<Character, Character>();
		this.mapping.put('}', '{');
		this.mapping.put(')', '(');
		this.mapping.put(']', '[');
	}

	public boolean isValid(String s) {

		if (s.isEmpty() || s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
			return false;
		}

		Stack<Character> st = new Stack<>();

		int i = 0;

		while (i < s.length()) {

			if (!mapping.containsKey(s.charAt(i))) {
				st.push(s.charAt(i));
			} else {
				char val1 = mapping.get(s.charAt(i));
				if(st.isEmpty() ) {
					return false;
				}
				char vv = st.pop();
				
				if (vv != val1) {
					return false;
				}
			}
			i++;
		}

		return st.isEmpty();

	}

	public static void main(String[] args) {
		ParenthesisOpenClose obj = new ParenthesisOpenClose();
		System.out.println(obj.isValid(""));
		
	}
}
