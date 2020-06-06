package interview;

import java.util.HashMap;

public class Test1 {
	
	public static Integer longestUniqueLen(String input ) {
		
		int len = input.length();
		String temp;
		int j,k,maxlen = 1,clen = 1;
		int checkPresent;
		
		HashMap<Integer,Integer> lookup = new HashMap<>();
		lookup.put(input.charAt(0)-'A',1);
		
		// abaabdce    abbbbdce    abccccdddd   abcade
		//abcdeeee
		
		//case 1 : in case item is not present in lookup keep updating j
		//case 2. if item present in lookup 
			//case 2.1 check for lemngth if it is max
			//
		for(int i=0;i<256 ; i++) {
			lookup.put(i, 0);
		}
		lookup.put(input.charAt(0)-'A',1);
		for(int i=1;i<len;i++) {
			checkPresent = lookup.get(input.charAt(i)-'A');
			if(checkPresent==0 || i-clen > checkPresent -1) {
				//lookup.put(""+input.charAt(0),1);
				clen++;
			}
			
			//temp = ""+input.charAt(i);
			
			else {
				if(clen>maxlen) {
					maxlen=clen;
					//k=i;
				}
				clen = i +1  - checkPresent;
			}
			lookup.put(input.charAt(i)-'A', i);
		}
		if(clen>maxlen) {
			maxlen=clen;
		}
		
		return maxlen;
	}
	
public static String longestUniqueWindow(String input ) {
		
		int len = input.length();
		String temp;
		int startingpt=0;
		int start = 0; 
		int j,k,maxlen = 1,clen = 1;
		int checkPresent;
		
		HashMap<Integer,Integer> lookup = new HashMap<>();
		lookup.put(input.charAt(0)-'A',1);
		
		// abaabdce    abbbbdce    abccccdddd   abcade
		//abcdeeee
		
		//case 1 : in case item is not present in lookup keep updating j
		//case 2. if item present in lookup 
			//case 2.1 check for lemngth if it is max
			//
		for(int i=0;i<256 ; i++) {
			lookup.put(i, 0);
		}
		lookup.put(input.charAt(0)-'A',1);
		int i;
		for(i=1;i<len;i++) {
			checkPresent = lookup.get(input.charAt(i)-'A');
			if(checkPresent==0 || i-clen > checkPresent -1) {
				//lookup.put(""+input.charAt(0),1);
				clen++;
			}
			
			//temp = ""+input.charAt(i);
			
			else {
				if(clen>maxlen) {
					maxlen=clen;
					//k=i;
					start = startingpt;
				}
				clen = i +1  - checkPresent;
				startingpt = lookup.get(input.charAt(i)-'A') + 1; 
			}
			lookup.put(input.charAt(i)-'A', i);
		}
		if(maxlen < i-startingpt) {
			maxlen=i-startingpt;
			start = startingpt;
		}
		
		return input.substring(start,maxlen);
	}
	
	
	public static void main(String[] args) {
		String ip = "aAcadeeeeeefghijklmnopmmmmmm";
	    String val = longestUniqueWindow(ip);
	    
	    System.out.println("val "+ val);
	}

}
