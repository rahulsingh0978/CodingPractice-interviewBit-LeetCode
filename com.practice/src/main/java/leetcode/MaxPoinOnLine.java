package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaxPoinOnLine {
	// need to fixed
	public int maxPointsFixMe(int[][] points) {

		int n = points.length;
		if (n < 2) {
			return points[0][0];
		}
		int max = 0;
		int globalMax = 0;
		Set<String> set = new HashSet<>();
		for (int i = 0; i < n && !set.contains(points[i][0] + "-" + points[i][1]); i++) {
			Map<Double, Integer> map = new HashMap();
			int[] a = points[i];
			int same = 0;
			for (int j = i + 1; j < n; j++) {
				if (sameCheck(a, points[j])) {
					same++;
					continue;
				} else {
					double slope = slopeCalculate(a, points[j]);
					map.put(slope, map.getOrDefault(slope, 1) + 1);
					max = Math.max(max, map.get(slope));
				}
			}
			set.add(a[0] + "-" + a[1]);
			globalMax = Math.max(globalMax, max);
		}
		return max;
	}

	public boolean sameCheck(int[] a, int[] b) {
		return a[0] == b[0] && a[1] == b[1];
	}

	public double slopeCalculate(int[] a, int[] b) {
		if (a[0] == b[0]) {
			return Double.MAX_VALUE;
		}
		if (a[1] == b[1]) {
			return 0;
		} else {
			return ((double) a[0] - b[0]) / ((double) a[1] - b[1]);
		}
	}

	
	public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
		
	    int n = a.size();
	    if(n<3)
	    	return n;
	    Map<Integer,Map<Integer,Integer>> map = new HashMap<Integer,Map<Integer,Integer>>();
	    
	    int maxCount=0;
	    for(int i=0;i<n;i++){
	        map.clear();
	        int xval = a.get(i);
	        int yval = b.get(i);
	        int overlap=0;
	        int count=0;
	        for(int j=i+1;j<n;j++){
	            int x=a.get(j)-xval;
	            int y=b.get(j)-yval;
	            if(x==0 && y==0){
	                overlap++;
	                continue;
	            }
	            int gcd = generateGCD(x,y);
	            if(gcd!=0){
	                x/=gcd;
	                y/=gcd;
	            }
	            
	            if(map.containsKey(x)){
	                if(map.get(x).containsKey(y)){
	                    map.get(x).put(y,map.get(x).get(y)+1);
	                }else{
	                   
	                    map.get(x).put(y,1);
	                }
	            }else{
	                Map<Integer,Integer> newMap = new HashMap();
	                newMap.put(y,1);
	                map.put(x,newMap);
	            }
	            count = Math.max(count,map.get(x).get(y));
	        }
	        maxCount = Math.max(maxCount,maxCount+overlap+1);
	    }
	    return maxCount;
	}
	
	public int maxPoints(int[][] points) {
		int n = points.length;
		if (n<3)
			return n;
		
		Map<Integer, Map<Integer, Integer>> map = new HashMap<Integer, Map<Integer, Integer>>();
		int result = 0;
		for (int i = 0; i < points.length; i++) {
			/*
			 * this ensures every time the new slope is taken so all the parallel
			 * slopes would be avoided
			 */
			map.clear();
			int overlap = 0, max = 0;
			for (int j = i + 1; j < points.length; j++) {
				int x = points[j][0] - points[i][0];
				int y = points[j][1]- points[i][1];
				if (x == 0 && y == 0) {
					overlap++;
					continue;
				}
				int gcd = generateGCD(x, y);
				/*
				 * it give the ratio numerator and denomerator for the slope
				 */
				if (gcd != 0) {
					x /= gcd;
					y /= gcd;
				}

				/*
				 * map stores the denominator and map the numerator  with count 
				 */
				if (map.containsKey(x)) {
					if (map.get(x).containsKey(y)) {
						map.get(x).put(y, map.get(x).get(y) + 1);
					} else {
						map.get(x).put(y, 1);
					}
				} else {
					Map<Integer, Integer> m = new HashMap<Integer, Integer>();
					m.put(y, 1);
					map.put(x, m);
				}
				max = Math.max(max, map.get(x).get(y));
			}
			result = Math.max(result, max + overlap + 1);
		}
		return result;

	}
	public int generateGCD(int a,int b) {
		if(b==0) {
			return a;
		}
		return generateGCD(b,a%b);
	}

	public static void main(String[] args) {
		MaxPoinOnLine obj = new MaxPoinOnLine();
		//int[][] points = { { 1, 1 }, { 3, 2 }, { 5, 3 }, { 4, 1 }, { 2, 3 }, { 1, 4 } };
		int[][] points ={{1, 1},{ 1 ,1},{ 1 ,1},{ 1, 1},{ 1, 1}};
		ArrayList<Integer> a= new ArrayList<>();
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		ArrayList<Integer> b= new ArrayList<>();
		b.add(1);
		b.add(1);
		b.add(1);
		b.add(1);
		b.add(1);
		System.out.println(obj.maxPoints(a, b));
		//System.out.println(obj.maxPoints(points));
	}
}
