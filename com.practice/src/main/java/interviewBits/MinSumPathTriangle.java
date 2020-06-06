package interviewBits;

import java.util.ArrayList;

public class MinSumPathTriangle {
	public int minimumTotal(ArrayList<ArrayList<Integer>> a) {
	    int r = a.size();
	    ArrayList<Integer> dp = a.get(r-1);
	    for(int i=r-2;i>=0;i--){
	        for(int j=0;j<a.get(i).size();j++){
	            int val = a.get(i).get(j) + min(dp.get(j),dp.get(j+1));
	            dp.remove(j);
	            dp.add(j,val);
	            
	        }
	    }
	    return dp.get(0);
	}
	public int min( int c, int d){
	    return c<d?c:d;
	}
	public int minresult(ArrayList<Integer> l){
	    int minVal = l.get(0);
	    for(int i=1;i<l.size()-1;i++){
	        System.out.print(l.get(i));
	        minVal=min(minVal,l.get(i));
	    }
	    return minVal;
	}
	
	public static void main(String[] args) {
		MinSumPathTriangle obj = new MinSumPathTriangle();
		ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2= new ArrayList<>();
		ArrayList<Integer> l3= new ArrayList<>();
		l1.add(2);
		l2.add(6);
		l2.add(6);
		l3.add(7);
		l3.add(8);
		l3.add(4);
		lst.add(l1);
		lst.add(l2);
		lst.add(l3);
		for(ArrayList<Integer> i : lst) {
			for(Integer j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println(obj.minimumTotal(lst));
	}
}
