package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupAnagram {
	public List<List<String>> groupAnagrams(String[] strs) {
		
	    
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        for( String s : strs){
        	char[] chars = s.toCharArray();
    	    Arrays.sort(chars);
    	    String sorted = new String(chars);
    	    if(map.containsKey(sorted)) {
    	    	map.get(sorted).add(s);
    	    }else {
    	    	List<String> newList = new ArrayList<String>();
    	    	newList.add(s);
    	    	map.put(sorted,newList );	
    	    }
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> e: map.entrySet()) {
        	
        	result.add(e.getValue());
        }
        return result;
    }
	
}
