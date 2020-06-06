package rahul_practice.com.practice;

public class CheckIsDUplicateInStringWithoutExtraDataStructure {

	public static boolean checkDuplicate(String value) {
		int check = 0;
		for(int i=0;i<value.length();i++) {
			int val = value.charAt(i)-'a';
			
			
			if((check & (1<<val)) >0) {
				return false;
			}
			
			check |= 1<<val;
		}
		return true;
    } 
      
	public static void main(String[] args) {
		
		
		//System.out.println( 1<<3);
		String s = "abcdefgh"; 
        
        if (checkDuplicate(s)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
	}
}
