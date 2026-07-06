class Solution {

    public void nextPermutation(int[] nums) {
        
        int n = nums.length ;
        //Find the Pivot From the Array !
        int pivot = -1;
        //Pivot have to be from one Number Before then Last Number !! so n-2 instead of n-1
        for(int i = n - 2 ; i >= 0 ; i--){
            if(nums[i] < nums[i + 1]){
                pivot = i;
                break ;
            }
        }

        //If Pivot is exists and then Do this .. 
        if(pivot != -1){
            //Find the First Largest From Right to Left until before Pivot..
            for(int i = n - 1 ; i > pivot ; i-- ){
                if(nums[i] > nums[pivot]){
                    
                    //Step 3 :Swap the Position with 
                    swap(nums, i, pivot);
                    break;
                }
            }
           
            }
            //Even there is Pivot , it Reverse the Entier Valuse to get Next Permutation :i.e, pivot = -1+1=>0 to n-1 Total Values in the Array ! 
            reverse(nums, pivot + 1, n - 1); 
        }

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int left, int right) {

        while(left < right) {

            swap(nums, left, right);

            left++;
            right--;
        }
    }
    
}