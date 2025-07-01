class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                int profit=prices[i] - min;
                if(profit>max){
                    max=profit;
                }
            }
        }
        return max;
    }
}