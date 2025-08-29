class Solution {
    public int maxProfit(int[] price) {
        // int buy=prices[0];
        // int profit=0;
        // int max=0;
        // for(int i=0;i<prices.length;i++){
        //     if(prices[i]<buy){
        //         buy=prices[i];
        //     }
        //     else{
        //         profit=prices[i]-buy;
        //         if(profit>max){
        //             max=profit;
        //         }
        //     }
        // }
        // return max;

        int n=price.length;
        int buy=price[0];
        int profit=0;
        int max_profit=0;
        for(int i=0;i<n;i++){
            if(price[i]<buy){
                buy=price[i];
            }
            else{
                profit=price[i]-buy;
                if(profit>max_profit){
                    max_profit=profit;
                }
            }
        }
        return max_profit;
    }
}