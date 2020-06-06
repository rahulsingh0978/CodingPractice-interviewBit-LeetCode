package leetcode;

import java.util.Scanner;

public class StringAnagram {
	public String anagram(String input1, String input2) {
		if (input1.length() == 0 || input2.length() == 0)
			return "NO";
		if (input1.length() != input2.length()) {
			return "NO";
		}
		int r = 0;
		for (int i = 0; i < input1.length(); i++) {
			r = r ^ input1.charAt(i) ^ input2.charAt(i);
		}
		return r == 0 ? "YES" : "NO";
	}

	public static void main(String[] args) {
		StringAnagram obj = new StringAnagram();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0;
		while (i<n) {
			String t1 = sc.nextLine();
			
			System.out.println(obj.anagram(t1.split(" ")[0],t1.split(" ")[1]));
			i++;
		}
		
	}
}
