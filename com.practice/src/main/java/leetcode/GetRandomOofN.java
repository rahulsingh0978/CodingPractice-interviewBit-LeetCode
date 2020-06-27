package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetRandomOofN {
	private int size;
    private  Map<Integer,Integer> map;
    private List<Integer> lst;
    /** Initialize your data structure here. */
    public GetRandomOofN() {
        this.map = new HashMap<Integer,Integer>();
        this.lst = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!this.map.containsKey(val)){
            this.map.put(val,this.lst.size());
            this.lst.add(val);
            return true;
        }
        return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!this.map.containsKey(val)){
            return false;
        }
        int index = this.map.get(val);
        this.lst.remove(index);
        this.map.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int n = this.lst.size();
        if(n==0){
            return -1;
        }
        int index = (int) (Math.random()*100)%n;
        return lst.get(index);
        
    }
    public static void main(String[] args) {
    	GetRandomOofN obj = new GetRandomOofN();
    	boolean param_1 = obj.insert(val);
    	boolean param_2 = obj.remove(val);
    	int param_3 = obj.getRandom();
	}

}
