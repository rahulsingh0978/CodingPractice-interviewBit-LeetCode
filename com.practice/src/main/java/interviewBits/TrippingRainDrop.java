package interviewBits;

import java.util.List;

public class TrippingRainDrop {

	public int trap(final int[] A) {
		int water = 0;
		int lmax=0;
		int rmax=0;
		int l=0;
		int r=A.length-1;
		while(l<r) {
			if(A[l]<A[r]) {
				if(lmax<A[l]) {
					lmax=A[l];
				}else {
					water+=lmax-A[l];
					l++;
				}
			}else {
				if(rmax<A[r]) {
					lmax=A[r];
				}else {
					water+=rmax-A[r];
					r--;
				}
			}
		}
		return water;
    }
}
