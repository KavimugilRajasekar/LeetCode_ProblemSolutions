class Solution {
    public int maxProfit(int[] prices) {

        // int maxProfit = 0;
        // int currentMax = 0 ;
        // int n = prices.length ;

        if(prices.length == 0){
            return 0;
        }
        if(prices.length == 1){
            return 0 ;
        }

        // for(int i = 0 ; i <= n - 2 ; i++){
        //     for(int j = i + 1 ; j <= n - 1 ; j++){
        //         currentMax = prices[j] - prices[i];
        //         maxProfit = Math.max(currentMax,maxProfit);
        //     }
        // }


        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1 ; i < prices.length ; i++){
            
            //Get the MinPrice , Which is the Key to Find the Max Profit Buz Sub with MinPrice Gives the Max Profit ! 
            if( prices[i] < minPrice ){
                minPrice = prices[i];
            }

            //Then Now Compute the CurrentProfit With MinPrice !!
            int currentProfit = prices[i] - minPrice;

            //Check for MaxProfit is Availabe or not in this Computation ! 
            if( currentProfit > maxProfit ){
                maxProfit = currentProfit ;
            }
        }
        return maxProfit;
    }
}