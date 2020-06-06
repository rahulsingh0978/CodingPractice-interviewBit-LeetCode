package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaxRectArea {
	public int largestRectangleArea(ArrayList<Integer> A) {
		Stack<Integer> s = new Stack<>();
		int len = A.size();
		int i;
		int top;
		int area = 0;
		int maxArea = 0;
		for (i = 0; i < len;) {
			if (s.isEmpty() || A.get(i) >= A.get(s.peek())) {
				s.push(i++);
			} else {
				top = A.get(s.pop());
				if (s.isEmpty()) {
					area = top * i;
				} else {
					area = top * (i - s.peek() - 1);
				}
				if (maxArea < area) {
					maxArea = area;
				}
			}
		}
		while(!s.isEmpty()) {
			top =A.get(s.pop());
			if(s.isEmpty()) {
				area=top*i;
			}else {
				area=top*(i-s.peek()-1);
			}
			if (maxArea < area) {
				maxArea = area;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		MaxRectArea obj = new MaxRectArea();
		ArrayList<Integer> A = new ArrayList<>();
		A.add(2);
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(1);
		/*A.ge
		System.out.println(obj.largestRectangleArea(A));*/
	}
}
