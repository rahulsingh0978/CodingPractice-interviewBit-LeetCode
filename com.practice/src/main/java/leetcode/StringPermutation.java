package leetcode;

import java.util.Arrays;

public class StringPermutation {
	boolean flag = false;
    public boolean checkInclusion(String s1, String s2) {
        permute(s1, s2, 0);
        return flag;
    }
    public String swap(String s, int i0, int i1) {
        if (i0 == i1)
            return s;
        String s1 = s.substring(0, i0);
        String s2 = s.substring(i0 + 1, i1);
        String s3 = s.substring(i1 + 1);
        return s1 + s.charAt(i1) + s2 + s.charAt(i0) + s3;
    }
    void permute(String s1, String s2, int l) {
        if (l == s1.length()) {
            if (s2.indexOf(s1) >= 0)
                flag = true;
        } else {
            for (int i = l; i < s1.length(); i++) {
                s1 = swap(s1, l, i);
                permute(s1, s2, l + 1);
                s1 = swap(s1, l, i);
            }
        }
    }
    
    
    public boolean permuteSortApproach(String s1, String s2) {
    	s1 = sort(s1);
    	for(int i=0;i<=s2.length()-s1.length();i++) {
    		if(s1.equalsIgnoreCase(sort(s2.substring(i,i+s1.length())))) {
    			return true;
    		}
    		
    	}
    	return false;
    }
    public String sort(String s) {
    	char[] ch = s.toCharArray();
    	Arrays.sort(ch);
    	return new String(ch);
    }
    public static void main(String[] args) {
    	StringPermutation obj = new StringPermutation();
    	//System.out.println(obj.checkInclusion("abc","bsbsbsbca"));
    	System.out.println(obj.permuteSortApproach("ab",
    			"eidboaoo"));
	}
}
