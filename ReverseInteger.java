public class ReverseInteger{
    public static void main(String[] args) {
        System.out.println(Solution.reverse(1534236469));
    }
}
class Solution {
    public static int reverse(int x) {
        if (x == 0) return 0;

        String num = new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString();

        try {
            int reversed = Integer.parseInt(num);
            return Integer.signum(x) * reversed;
        } catch (NumberFormatException e) {
            return 0; // If the reversed number overflows
        }
    }
}

// class Solution {
//     public int reverse(int x) {
//         int reversed = 0;

//         while (x != 0) {
//             int digit = x % 10;
//             x /= 10;

//             // Check for overflow before multiplying
//             if (reversed > Integer.MAX_VALUE / 10 || 
//                (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
//                 return 0;
//             }
//             if (reversed < Integer.MIN_VALUE / 10 || 
//                (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
//                 return 0;
//             }

//             reversed = reversed * 10 + digit;
//         }

//         return reversed;
//     }
// }
