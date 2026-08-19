class Solution {
    public int lengthOfLastWord(String s) {
       // Finding the last Index wont be the correct answer but , Split them and find the last Index and Find its Length !! 
        return s.split(" ")[s.split(" ").length - 1].length();
        
    }
}