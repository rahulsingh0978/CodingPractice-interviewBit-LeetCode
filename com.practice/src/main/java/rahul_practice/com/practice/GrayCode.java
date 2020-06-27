package rahul_practice.com.practice;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public List<Integer> grayCode(int n) {
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i< 1<<n;i++){ //1<<n will do 2^n
            lst.add(i^i>>1); // i>>1 will do i/2 and doing xor will 
        }
        return lst;
    }
	public static void main(String[] args) {
		GrayCode obj = new GrayCode();
		obj.grayCode(2);
		System.out.println(3>>1);
	}
}
