package interview;

public class FIndIfPalindromeAfterEdit {
	public boolean isPalindrome1(String s, int low, int high) {
		while (low < high) {
			if (s.charAt(low) != s.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}

	public int ifPossibleWithEdit(String s) {
		int l = 0;
		int h = s.length() - 1;
		while (l < h) {
			if (s.charAt(l) == s.charAt(h)) {
				l++;
				h--;
			} else {

				if (isPalindrome1(s, l + 1, h)) {
					return l;
				}
				if (isPalindrome1(s, l, h - 1)) {
					return h;
				}
				return -1;
			}
		}

		return -2;
	}

	static boolean isPalindrome(String str, int low, int high) {
		while (low < high) {
			if (str.charAt(low) != str.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}
	static int possiblePalinByRemovingOneChar(String str) {
		int low = 0, high = str.length() - 1;
		while (low < high) {
			if (str.charAt(low) == str.charAt(high)) {
				low++;
				high--;
			} else {
				if (isPalindrome(str, low + 1, high))
					return low;

				if (isPalindrome(str, low, high - 1))
					return high;
				return -1;
			}
		}

		return -2;
	}

	public static void main(String[] args) {
		FIndIfPalindromeAfterEdit obj = new FIndIfPalindromeAfterEdit();
		String s = "abcba";
		System.out.println(possiblePalinByRemovingOneChar(s));
		System.out.println(obj.ifPossibleWithEdit(s));
	}
}
