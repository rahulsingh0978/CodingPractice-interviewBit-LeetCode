package rahul_practice.com.practice;

public class PassReferenceTest {
public void changevalue(int[] ar) {
	System.out.println("Value of a "+ar[0]);
	ar[0]++;
	System.out.println("Value after is "+ar[0]);
}
public static void main(String[] args) {
	PassReferenceTest obj = new PassReferenceTest();
	int[] r = {2};
	obj.changevalue(r);
	System.out.println(" out of function value is "+r[0]);
}
}
