class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> sol = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            int complement = target - nums[i] ; 
            if(sol.containsKey(complement)){
                return new int[]{sol.get(complement) , i};
            }else{
                sol.put(nums[i],i);
            }
        }

        return new int[]{}; 
        
    }
}