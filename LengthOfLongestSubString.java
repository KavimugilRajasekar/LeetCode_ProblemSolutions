import java.util.HashSet;

public class LengthOfLongestSubString {
    public static void main(String args[]){
        System.out.println(Solution.lengthOfLongestSubString("abcabcabb"));
    }
}
class Solution {
    public static int lengthOfLongestSubString(String s){
       HashSet<Character> seen = new HashSet<>();
       int left = 0 , maxLen = 0;
       for(int right = 0 ; right < s.length() ; right++){
        while (seen.contains(s.charAt(right))) {
            seen.remove(s.charAt(left)); 
            left++;
        }
        seen.add(s.charAt(right));
        maxLen = Math.max(maxLen,right - left + 1);
       } 
       return maxLen;
    }

}
