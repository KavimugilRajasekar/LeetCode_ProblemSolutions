class Solution {
    private void swap(int[] nums , int left , int right ){
        int temp = nums[left];
        nums[left] = nums[right] ;
        nums[right] = temp ;   
    }
    public void sortColors(int[] nums) {

     // Create a Dutch Flag's ,i.e Low Mid High
     int low = 0 ; 
     int mid = 0;
     int high = nums.length - 1 ;
     
     while( mid <= high ){

     //By Keeping the Mid , Which as Checking Pointer We will find rest of the Positions !!
     if( nums[mid] == 0 ){
        swap(nums,mid,low);
        mid++;
        low++;
     }
     else if( nums[mid] == 1){
        mid++;
     }
     else{
        //i.e, nums[mid] == 2
        swap(nums,mid,high);
        high--;
     }

     }   
    }
}