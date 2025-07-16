import java.util.Stack;
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(Solution.isValid("(({}))"));
    }
}

class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        char[] parentheses = s.toCharArray();
        try
        {
            for (char paren : parentheses) {
                if(paren == '}' && stack.peek() == '{' || paren == ')' && stack.peek() == '(' || paren == ']' && stack.peek() == '[') 
                stack.pop();
                else 
                stack.push(paren);
            }
            return stack.isEmpty();
        }
        catch(Exception e){
            return false;
        }
        
    }
}
