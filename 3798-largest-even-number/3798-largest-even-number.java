class Solution {
    public String largestEven(String s) {

        if(s.length() == 0){
            return "";
        }else if(s.length() == 1 ){
            if(s.toCharArray()[0] == '1'){
                return "";
            }
            return new String(s);
        } else {
            StringBuilder sb = new StringBuilder(s);
            for(int i = s.length() - 1 ; i >= 0 ; i--){
                if(sb.charAt(i) == '1' ){
                    sb.deleteCharAt(i);
                }
                else{
                    break;
                }
            }
            return sb.toString() ;
        }
    }
}