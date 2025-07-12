import java.util.*;
public class FindMedianOfSortedArray {
    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,3,4,5};
        int[] num2 = new int[]{6,7};
        System.out.println(Solution.findMedianOfSortedArrays(num1, num2));
    }
}
class Solution {
    public static double findMedianOfSortedArrays(int[] num1 , int[] num2){
        List<Integer> combined = new ArrayList<>();
        for(int num : num1){
            combined.add(num);
        }
        for(int num : num2){
            combined.add(num);
        }
        Collections.sort(combined);
        int size = combined.size();
        if(size % 2 == 1){
            return combined.get(size/2);
        }
        else{
            return (combined.get(size / 2) + combined.get(size / 2 - 1) ) /2 ;
        }
    }
}