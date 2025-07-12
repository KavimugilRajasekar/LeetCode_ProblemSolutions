import java.util.HashMap;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0 ; i < nums.length ; i++){
            int Complement = target - nums[i];
            if(map.containsKey(Complement))
            return new int[]{map.get(Complement),i};

            map.put(nums[i],i);

        }
        return new int[]{};
    }
}
public class TwoSum{
    public static void main(String[] args){

        int[] indexes = Solution.twoSum(new int[]{2,7,11,15},19);
        if (indexes.length == 0 ) {
            System.out.println("No Matchs are found!");
        }
        for(int index : indexes){
            System.out.print(index+" ");
        }
    }
}