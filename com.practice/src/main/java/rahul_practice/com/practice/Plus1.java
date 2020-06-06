package rahul_practice.com.practice;

public class Plus1 {
	public static int[] plusOne(int[] A) {
        int value = 0;
        int len=0;
        for(int i=0;i< A.length ; i++){
        	//System.out.println(value+" "+value*10+" "+A[i]+" "+((value*10)+A[i]));
            value =(value*10)+A[i];
            /*if(A[i]!=0){
                len++;
            }*/
        }
        value+=1;
        //int digit = value;
        int[] b = new int[Integer.toString(value).length()];
        for(int j=0;j<Integer.toString(value).length();j++){
        	//System.out.println(Integer.toString(value).charAt(j)-'0');
            b[j]=Integer.toString(value).charAt(j)-'0';
            
        }
        return b;
    }
	public static void main(String[] args) {
		int a[] = {0,1,2,3};
		int[] p =plusOne(a);
		for(int g: p) {
			System.out.print(g+" ");
		}
		
		//System.out.println(Integer.toString(124).charAt(0).getClass().getName());
	}
}
