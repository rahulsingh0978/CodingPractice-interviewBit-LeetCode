package rahul_practice.com.practice;

public class StringPermutation {
	public static void permutestring(char[] input,char[] result ,int[] count, int level) {
		if(level==input.length) {
			for(char i: result) {
				System.out.print(i+" ,");
			}
			System.out.println();
		}else {
			for(int i=0;i<input.length;i++) {
				if(count[i]==0) {
					continue;
				}else {
					result[level]=input[i];
					count[i]--;
					permutestring(input, result, count, level+1);
					count[i]++;
				}
			}
		}
	}
	public static void main(String[] args) {
		char[] input = {'A','B','C'};
		int[] count = {1,1,1};
		char[] result = new char[3];
		permutestring(input,result,count,0);
	}
}
