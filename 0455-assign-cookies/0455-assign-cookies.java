class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;
        // Finding a Child and Matching Cookie for them !! 
        while(child < g.length && cookie < s.length ){
            if(s[cookie] >= g[child] ){

                child++;
            }
            cookie++;
        }

        return child;
    }
}