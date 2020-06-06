package leetcode;

public class MinSizeSumSUbArray {
	public int minSubArrayLen(int s, int[] nums) {
		int mxSoFar = 0;

		int result = Integer.MAX_VALUE;
		int st = 0;
		int end = 0;
		int n = nums.length;
		while (end < n) {
			mxSoFar += nums[end];
			end++;
			while (mxSoFar >= s) {
				result = Math.min(result, end-st);
				mxSoFar -= nums[st];
				st++;	
			}
		}
		return (result!=Integer.MAX_VALUE)?result:0;
	}
	public static void main(String[] args) {
		MinSizeSumSUbArray obj = new MinSizeSumSUbArray();
		int[] num = {2,3,1,2,4,3};
		int n=7;
		System.out.println(obj.minSubArrayLen(n,num));
	}
}
