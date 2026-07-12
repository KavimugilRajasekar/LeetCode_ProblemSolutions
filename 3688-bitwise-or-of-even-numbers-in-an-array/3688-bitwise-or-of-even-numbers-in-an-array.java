class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int result = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if( (nums[i] & 1 ) != 1 ){
                result |= nums[i] ;  
            }
        }
        return result;
        
    }
}