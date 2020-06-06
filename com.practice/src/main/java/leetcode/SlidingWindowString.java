package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SlidingWindowString {
	public int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		int slow=0;
		int fast=0;
		int n=s.length();
		int result=0;
		int max=0;
		while(fast<n) {
			if(!set.contains(s.charAt(fast))) {
				set.add(s.charAt(fast));
				
				fast++;
				max = Math.max(max, set.size());
				
			}else {
				set.remove(s.charAt(slow));
				slow++;
				//result--;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		SlidingWindowString obj = new SlidingWindowString();
		System.out.println(obj.lengthOfLongestSubstring("abcabcbb"));
	}
}
