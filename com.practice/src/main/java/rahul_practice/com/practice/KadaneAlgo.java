package rahul_practice.com.practice;

public class KadaneAlgo {
	public static void main(String[] args) {
		System.out.println("Start");
		int ar[] = { -2, -3, -4, -1, -2, -10, -5, -3 };
		/*int max_end_here = 0, max_so_far = 0;
		int i = 0;
		while (i < ar.length) {
			max_end_here += ar[i];
			if (max_end_here < 0) {
				max_end_here = 0;
			}
			if (max_so_far < max_end_here) {
				max_so_far = max_end_here;
			}
			i++;
		}
		System.out.println("max_so_far " + max_so_far);*/

		int msf = ar[0], mx = ar[0];
		for (int j = 1; j < ar.length; j++) {
			msf = Math.max(ar[j], ar[j] + msf);
			mx = Math.max(msf, mx);
		}
		System.out.println("negative max :" + mx);
	}
}
