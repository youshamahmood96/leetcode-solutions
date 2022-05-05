class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int res = 0;
        while(j<prices.length){
            res = Math.max(res,prices[j]-prices[i]);
            if(prices[j]-prices[i]<=0){
                i = j;
                j++;
            }
            else{
                j++;
            }
        }
        return res;
    }
}