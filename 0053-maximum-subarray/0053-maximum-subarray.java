class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE ;
        int currentSum = 0;

        for(int num : nums){
            currentSum += num ;

            maxSum = Math.max( maxSum , currentSum ); 

            // This is the Important Step that , it Resets the Sequence of Addition to Zero once if the Current became Negative and Helps to Find the Next Highest Sum by that !!!
            if(currentSum < 0 ){
                currentSum = 0 ;
            }
        }
        return maxSum ; 
    }
}