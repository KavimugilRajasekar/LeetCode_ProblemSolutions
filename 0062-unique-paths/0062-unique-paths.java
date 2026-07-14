class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        //First Fill up the First Row & Column which represents the Movies Availabe in those areas !!
        for(int i = 0 ; i < m ; i++){
            dp[i][0] = 1;
        }
        for(int i = 0 ; i < n ; i++){
            dp[0][i] = 1;
        }


        // Now Fill up the Cells with the Number of Possiblities of Solution that Might Get in there !! Based on the Formula , of Adding up the one previous row and Column cell in there !! 

        for(int i = 1 ; i < m ; i++){
            for(int j = 1 ; j < n ; j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }

        return dp[m - 1][n - 1];
        
    }
}