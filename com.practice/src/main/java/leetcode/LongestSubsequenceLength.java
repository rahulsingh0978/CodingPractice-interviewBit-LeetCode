package leetcode;

public class LongestSubsequenceLength {
	public int lengthOfLIS(int[] nums) {
		if(nums.length==0) {
			return 0;
		}

		int n = nums.length;
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[i] = 1;
		}
		int max=0;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					temp[i] = Math.max(temp[i], temp[j] + 1);
					max = temp[i]>max?temp[i]:max;
				}
			}
		}

		
		return max;

	}

	public static void main(String[] args) {
		LongestSubsequenceLength obj = new LongestSubsequenceLength();
		int[] num = {0};
		System.out.println(obj.lengthOfLIS(num));
	}
}
