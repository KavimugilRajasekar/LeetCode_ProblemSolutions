class Solution {
    public int firstUniqChar(String s) {
        int index = -1;

        //First Pass: Find the frequency of Each Characters ..
        // So that U can see , those Char are as in Array Format Mapping !! 

        int[] freq = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            freq[ch - 'a'] += 1; 
            // as Like Subracting a '5' - '0' in Number Convertion !! , so we will get the appopirate Index of the Position !! 
        } 

        //Second Pass: Find the First Character !!! in the String as Unique in String !! 
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(freq[ch - 'a'] == 1){
                return i;
            }
        }
        
        // if Not return , -1 !!
        return index;
        
    }
}