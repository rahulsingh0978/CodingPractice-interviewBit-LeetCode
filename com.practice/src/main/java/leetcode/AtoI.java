package leetcode;

public class AtoI {
	public int myAtoi(String str) {
		if (str == null || str.isEmpty()) {
			return 0;
		}
		boolean isNegative = false;
		int i = 0;
		int len = str.length();
		while (i < len && str.charAt(i) == ' ') {
			i++;
		}
		if(i>=len) {
			return 0;
		}
		long value = 0;

		if (str.charAt(i) == '-') {
			isNegative = true;
			i++;
		}
		else if (str.charAt(i) == '+') {
			i++;
		}
		if (Character.isAlphabetic(str.charAt(0))) {
			return 0;
		}
		while (i < len && Character.isDigit(str.charAt(i))) {
			value = value * 10 + (str.charAt(i) - '0');
			i++;
			if (value > Integer.MAX_VALUE || value < Integer.MIN_VALUE) {
				if (isNegative) {
					
				return Integer.MIN_VALUE;
				}else {
					return Integer.MAX_VALUE;
				}
			}
			
		}
		if (isNegative) {
			value = value * -1;
		}
		return (int) value;
	}

	public static void main(String[] args) {
		AtoI obj = new AtoI();
		System.out.println(obj.myAtoi("9223372") +23);
		System.out.println(Integer.MAX_VALUE + " , " + Integer.MIN_VALUE);
		System.out.println(0^0);
		System.out.println(1>>1);
		System.out.println(2>>1);
		System.out.println(3>>1);
		System.out.println(4>>1);
		System.out.println(5>>1);
		System.out.println(6>>1);
		System.out.println(7>>1);
	}
}
