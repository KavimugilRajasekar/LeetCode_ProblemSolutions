public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(Solution.removeElement(new int[]{1,2,3,3,4},3));
    }
}
class Solution {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i< nums.length ; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k ;
    }
}
