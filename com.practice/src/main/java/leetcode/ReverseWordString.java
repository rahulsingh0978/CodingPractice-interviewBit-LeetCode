package leetcode;

public class ReverseWordString {
	public void reverseWords(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) == ' ' || s.charAt(j) == ' ') {
				if (s.charAt(i) == ' ') {
					i++;
				}
				if (s.charAt(j) == ' ') {
					j--;
				}
			}
			else {
				break;
			}
		}
		int k;
		for (k = i; k <= j; k++) {
			System.out.print(s.charAt(k));
		}
		System.out.println(i+" "+j);
	}

	public static void main(String[] args) {
		ReverseWordString obj = new ReverseWordString();
		obj.reverseWords("  hello world!  ");
		;
	}
}
