package rahul_practice.com.practice;

public class RevString {
public static void main(String[] args) {
	String s = "i like this program very much";
	String[] ar = s.split(" ");
	for(int i = ar.length-1 ; i >=0 ; i--) {
		System.out.print(ar[i]+" ");
	}
}
}
