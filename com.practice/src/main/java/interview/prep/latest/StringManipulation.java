package interview.prep.latest;

public class StringManipulation {
	public static void main(String[] args) {
		String s1 = "ahRulR";
		String s2 = "Singh";
		String concat = s1.concat(" ").concat(s2);
		System.out.println(concat);
		char[] ar = s1.toCharArray();
		for(char i: ar) {
			System.out.println(i);
		}
		System.out.println(s1.indexOf('R'));
		System.out.println(s1.contains("Rue"));
		
		
		String obj = new String("Singh");
		System.out.println(obj.equals(s2));
	}
}