class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int minSum = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            int minsum=prices[i]-min;
            if(minsum>minSum){
                minSum=minsum;
            }
        }
        return minSum;
    }
}