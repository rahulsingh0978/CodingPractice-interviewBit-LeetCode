package interview;

import java.util.HashSet;
import java.util.Set;

public class Problem2 {
	public static void main(String[] args) {
		String s1 = "triangle";
		String s2 = "integral";
		Set<Character> set1 = new HashSet();
		for (int i = 0; i < s1.length(); i++) {
			set1.add(s1.charAt(i));
		}
	
		Set<Character> set2 = new HashSet();
		boolean flag = true;
		for (int j = 0; j < s2.length(); j++) {
			set2.add(s2.charAt(j));
		}
		if(set1.equals(set2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		System.out.println('a'^'a' ^'b'^'b');
		
		System.out.println(1<<3);
		
		
		//int[] arr = new int[26];
	}
	
	
}
