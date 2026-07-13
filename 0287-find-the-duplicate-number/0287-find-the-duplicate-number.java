class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        //Create a Cycle First !! 
        // Slow Moves 1 a Step at a Time !!
        // Fast Moves 2 a Step at a Time !!
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        //Find the Enterence of the Cycle of Created using
        // Now both the Slow as well Fast Moves 1 a Step at a Time !! 
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

        
    }
}