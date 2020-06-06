package leetcode;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
        int i = binarySearch(nums,0,nums.length-1,target);
        if(i!=-1){
            return i;
        }
        int j=0;
        for(;j<=nums.length-1;j++){
            if(!(target>nums[j])){
                break;
            }
        }
        return j;
    }
    public int binarySearch(int[] a ,int l,int h,int val){
        if(l<=h){
            int mid =l + (h - l) / 2; 
            if(a[mid]==val){
                return mid;
            }
            if(a[mid]>val){
                return binarySearch(a,l,mid-1,val);
            }else{
                return binarySearch(a,mid+1,h,val);
            }  
        }
        return h+1;
    }
	public static void main(String[] args) {
		SearchInsertPosition obj = new SearchInsertPosition();
		int[] ar = {1,3,5,6};
				
		int val= 2;
		System.out.println(obj.binarySearch(ar,0,3,val));
	}
}
