package rahul_practice.com.practice;

public class leetWaterContailner {
	public static int min(int a,int b) {
		return a<b?a:b;
	}
	public int maxArea(int[] height) {
		int l = 0, r = height.length - 1;
		int area = 0, maxArea = 0;

		while (l < r) {

			area = (r - l) * (height[l]<height[r]?height[l]:height[r]);
			if(height[l] < height[r]) {
				l++;
			}else {
				r--;
			}
			if(maxArea<area) {
				maxArea = area;
			}
			
		}
		return maxArea;
	}
}
