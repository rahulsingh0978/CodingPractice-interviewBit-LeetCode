package leetcode;

import java.math.BigDecimal;

public class PowImpl {
	public double myPow(double x, int n) {

		if (x == 0) {
			return 0;
		}
		if (x == 1 || n == 0) {
			return 1;
		}
		if (n == 1) {
			return x;
		}
		if (n < Integer.MIN_VALUE) {
			return 0;
		}
		if (x == -1) {
			if (n % 2 == 0)
				return 1;
			else
				return -1;
		}
		if (n < 0) {
			x = 1 / x;
			n = -n;
		}
		double result = 1.0;
		while (n > 0) {
			if ((n & 1) != 0) {
				result *= x;
			}
			x = x * x;
			n = n >> 1; // gives half floor function
		}
		return result;
	}

	public double myPow1(double x, int n) {
		if (n == 0)
			return 1;
		if (x == 1)
			return 1;
		if (x == -1) {
			if (n % 2 == 0)
				return 1;
			else
				return -1;
		}

		if (n == Integer.MIN_VALUE)
			return 0;
		if (n < 0) {
			n = -n;
			x = 1 / x;
		}
		double ret = 1.0;
		while (n > 0) {
			if ((n & 1) != 0)
				ret *= x;
			x = x * x;
			n = n >> 1;
		}
		return ret;
	}

	public int powmod(int x, int n, int d) {
		if (x == 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		if (d == 0) {
			return -1;
		}
		if (d == 1) {
			return 0;
		}
		long val = (long) (x * 1.0);
		long rep = (long) (n * 1.0);
		if (val < 0 && rep % 2 == 0) {
			val = -1 * val;
			val = val % d;
		}
		if (rep < 0) {
			rep = -1 * rep;
			val = 1 / val;
		}
		long result = 1;
		while (rep > 0) {
			if ((rep & 1) != 0) {
				result *= val % d;
			}
			val = (val * val) % d;
			rep = rep >> 1;
		}

		if (result < 0) {
			return (int) (d + result);
		}
		return (int) result;

	}

	public int powib(int x, int n, int d) {

		if (n == 0)
			return x == 0 ? 0 : 1;
		if (n == 1)
			return (x + d) % d;

		int val = (int) ((long) powib(x, n / 2, d) % d);
		long ans = (long) val * (long) val;
		ans %= d;

		if (n % 2 == 0) {
			return (int) (ans + d) % d;
		} else {
			ans *= x;
			ans %= d;
			return (int) (ans + d) % d;
		}
	}

	
	
	//fastest solution
	public int powib2(int x, int n, int d) {

		long rem = 1;
		int check = 0;

		// simple cases
		if (x == 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}

		// make x positive, check if power is odd
		if (x < 0) {
			x = Math.abs(x);
			if (n % 2 != 0) {
				check = 1;
			}
		}

		long temp = x % d;

		while (n != 0) {
			if (n % 2 != 0) {
				rem = (rem * temp) % d;
			}

			temp = temp * temp;
			temp = temp % d;

			n = n / 2;
			if (rem > d) {
				rem = rem % d;
			}
		}

		// if power is odd and x < 0, return d-rem
		if (check == 1) {
			return d - (int) rem;
		}

		return (int) rem;
	}

	public static void main(String[] args) {
		PowImpl obj = new PowImpl();
		System.out.println(obj.powib(71045970, 41535484, 64735492));
		System.out.println(-1 % 20);
		System.out.println(41535484 >> 1 >> 1);
	}
}