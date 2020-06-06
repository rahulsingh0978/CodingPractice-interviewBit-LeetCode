package leetcode;

public class Sqrt {
	public int mySqrt(int x) {

		return helper(1, x, x);
	}

	public int helper(int l, int h, int x) {

		if (l  < h) {
			int mid = l + (h - l) / 2;
			int value = mid*mid;
			if (l*l==x) {
				return x;
			}else if(h*h==x) {
				return h;
			}else {
				return l;
			}
			
			else if (value > x) {
				return helper(l, mid, x);
			} else {
				return helper(mid+1,h, x);
			}
		}
		return x;
	}

	public static void main(String[] args) {
		Sqrt obj = new Sqrt();
		System.out.println(obj.mySqrt());
	}
}
