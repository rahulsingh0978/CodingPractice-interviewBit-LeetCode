package leetcode;

public class NFactorial {
	 public int trailingZeroes(int n) {
	        if(n==0 ||n==1){
	            return 0;
	        }
	        int count =0;
	        int v = 5;
	        int value = n/v;
	        while(value >0){
	            count += value ;
	            v *=5;
	            value = n/v;
	        }
	        return count;
	        
	    }
	 public static void main(String[] args) {
		 NFactorial obj = new NFactorial();
		 System.out.println(obj.trailingZeroes(200));
		 System.out.println(200/625);
	}
}



public static int seat1(String A) {
	if(A == null || A.length() == 0) return 0;
    int count = 0;
    int lcount = 0;
    int rcount = 0;
    
    int s = 0;
    int e = A.length()-1;
    
    while(s <= e) {
        if(lcount < rcount) {
            if(A.charAt(s) == '.') {
                count = (count + lcount) % 10000003;
            } else {
                lcount++;
            }
            s++;
        } else {
            if(A.charAt(e) == '.') {
                count = (count + rcount) % 10000003;
            } else {
                rcount++;
            }
            e--;
        }
    }
    return count % 10000003;
}




int count = 0;
int two = 0;
int five = 0;
int n;
for(int i=1; i<=A; i++) {
    if(i % 5 == 0) {
        n = i;
        while(n % 5 == 0) {
            five++;
            n = n/5;
        }
    }
}
return five;
}
