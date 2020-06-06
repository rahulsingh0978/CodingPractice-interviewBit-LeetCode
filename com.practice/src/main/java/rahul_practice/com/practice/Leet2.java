package rahul_practice.com.practice;

public class Leet2 {
	public static int maxArea(int[] height) {
	    int l=0,r=height.length-1;
	    int area=0,maxArea=0;
	    
	    while(l<r) {
	        
	        area = (r-l)* (height[l]<height[r]?height[l]:height[r]);
	        if(height[l+1]>height[l]) {
	        	l++;
	        }
	        if(height[r-1]>height[r]) {
	        	r--;
	        }
	        
	        maxArea = area>maxArea ?area:maxArea;
	    } 
	        return maxArea;
	    }
	public static void main(String[] args) {
		int[] v = new int[]{2,3,4,5,18,17,6};
		int f=maxArea(v);
		System.out.println(f);
	}
}
