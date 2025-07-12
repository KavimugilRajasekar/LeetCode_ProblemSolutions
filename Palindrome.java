public class Palindrome {
    public static void main(String args[]){
        System.out.println(Solution.isPalindrome(-234));
    }    
}
class Solution {
    public static boolean isPalindrome(int x) {
    
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;
        while (x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x = x / 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}
